package com.example.designPattern.adapter.after;

import com.example.designPattern.adapter.before.Account;
import com.example.designPattern.adapter.before.security.UserDetails;

//adapter
public class AccountUserDetails implements UserDetails {

    private Account account;

    public AccountUserDetails(Account account) {
        this.account = account;
    }

    @Override
    public String getUsername() {
        return account.getName();
    }

    @Override
    public String getPassword() {
        return account.getPassword();
    }
}
