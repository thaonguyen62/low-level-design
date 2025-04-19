package interfaces;


import constant.AccountType;
import model.EmailModel;

import java.util.List;

@FunctionalInterface
public interface FilterSpamEmails {

    List<EmailModel> filter(AccountType type, List<EmailModel> emails);
}
