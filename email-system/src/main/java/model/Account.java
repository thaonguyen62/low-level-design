package model;

import constant.AccountType;
import interfaces.FilterSpamEmail;

import java.util.List;

public abstract class Account implements FilterSpamEmail {
    private String accountId;
    private final AccountType accountType;
    private List<EmailModel> emailModels;


    public AccountType getAccountType() {
        return accountType;
    }

    public List<EmailModel> getEmailModels() {
        return emailModels;
    }

    public void setEmailModels(List<EmailModel> emailModels) {
        this.emailModels = emailModels;
    }

    public Account(String accountId, AccountType accountType) {
        this.accountId = accountId;
        this.accountType = accountType;
    }


    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

}
