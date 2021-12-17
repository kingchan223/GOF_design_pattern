package com.example.designPattern.adapter.after;

import com.example.designPattern.adapter.before.AccountService;
import com.example.designPattern.adapter.before.security.LoginHandler;
import com.example.designPattern.adapter.before.security.UserDetailsService;

public class App {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();//adaptee
        //adaptee를 adapter 에 넣는다.
        //그러면 target 이 반환된다.
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        //이제 client(loginHandler)는 반환된 target 으로 로그인을 할 수 있다.
        LoginHandler loginHandler = new LoginHandler(userDetailsService);
        String login = loginHandler.login("kingchan", "kingchan");//
        System.out.println(login);
    }
}
