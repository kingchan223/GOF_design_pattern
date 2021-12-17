package com.example.designPattern.adapter.before;

//adaptee
public class AccountService {

    public Account findAccountByUsername(String username){
        Account account = new Account();
        account.setName(username);
        account.setPassword(username);
        account.setEmail(username);
        return account;
    }

    public void createNewAccount(Account account){
        //새로운 account 를 만드는 로직
    }
    public void updateAccount(Account account){
        //기존의 account 를 update 하는 로직
    }
}
