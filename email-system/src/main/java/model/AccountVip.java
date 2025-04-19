package model;

import constant.AccountType;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class AccountVip extends Account {

    private static final List<String> patternSpam = Arrays.asList("spam", "promotion", "win");

    public AccountVip(String accountId, AccountType accountType) {
        super(accountId, accountType);
    }

    @Override
    public List<EmailModel> filter() {
        return this.getEmailModels().stream()
                .filter(emailModel -> {
                    Pattern spamPattern = Pattern.compile(
                            String.join("|", patternSpam),
                            Pattern.CASE_INSENSITIVE
                    );
                    String subject = Optional.ofNullable(emailModel.getSubject()).orElse("");
                    return !spamPattern.matcher(subject).find();
                })
                .collect(Collectors.toList());
    }


}
