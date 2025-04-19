package service;

import constant.EmailStatus;
import model.Account;
import model.EmailModel;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SearchService {

    public List<EmailModel> searchMailNotYet(Account account, List<EmailModel> emailModels) {
        return account.filterSpam(emailModels).stream()
                .filter(email -> email.getStatus() == EmailStatus.NOT_YET)
                .collect(Collectors.toList());
    }

    public List<EmailModel> searchMailWithPattern(String key, Account account, List<EmailModel> emailModels) {
        return account.filterSpam(emailModels).stream()
                .filter(emailModel -> emailModel.getTo().contains(key))
                .collect(Collectors.toList());
    }
    public List<EmailModel> searchMailReceiveRecent(Account account, List<EmailModel> emailModels) {
        return account.filterSpam(emailModels).stream()
                .sorted(Comparator.comparing(EmailModel::getSentAt).reversed())
                .collect(Collectors.toList());
    }



}
