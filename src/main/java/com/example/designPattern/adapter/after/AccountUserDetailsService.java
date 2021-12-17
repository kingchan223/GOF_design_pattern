package com.example.designPattern.adapter.after;

import com.example.designPattern.adapter.before.Account;
import com.example.designPattern.adapter.before.AccountService;
import com.example.designPattern.adapter.before.security.UserDetails;
import com.example.designPattern.adapter.before.security.UserDetailsService;

//adapter
public class AccountUserDetailsService implements UserDetailsService {

    AccountService accountService;

    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        Account account = accountService.findAccountByUsername(username);
        return new AccountUserDetails(account);
    }
}
