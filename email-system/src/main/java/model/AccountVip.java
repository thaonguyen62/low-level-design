package model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class AccountVip extends Account {

    private static final List<String> patternSpam = Arrays.asList("spam", "promotion", "win");

    @Override
    public boolean isVip() {
        return true;
    }

    @Override
    public List<EmailModel> filterSpam(List<EmailModel> emailModels) {
        return emailModels.stream()
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

    public AccountVip(String accountId) {
        super(accountId);
    }

    public AccountVip() {
    }
}
