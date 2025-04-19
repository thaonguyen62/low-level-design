package model;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Account {
    private String accountId;

    public boolean isVip(){
        return false;
    }

    public Account(String accountId) {
        this.accountId = accountId;
    }

    public Account() {
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public List<EmailModel> filterSpam(List<EmailModel> emailModels){
        return emailModels;
    }
}
