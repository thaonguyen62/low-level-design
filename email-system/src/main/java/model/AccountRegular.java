package model;

import constant.AccountType;

import java.util.List;

public class AccountRegular extends Account{
    public AccountRegular(String accountId, AccountType accountType) {
        super(accountId, accountType);
    }

    @Override
    public List<EmailModel> filter() {
        return this.getEmailModels();
    }
}
