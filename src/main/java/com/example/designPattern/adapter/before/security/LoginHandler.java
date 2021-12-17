package com.example.designPattern.adapter.before.security;

//client
public class LoginHandler {
    UserDetailsService userDetailService;

    public LoginHandler(UserDetailsService userDetailService) {
        this.userDetailService = userDetailService;
    }

    public String login(String username, String password){
        UserDetails userDetails = userDetailService.loadUser(username);
        if(userDetails.getPassword().equals(password))
            return userDetails.getUsername();
        else
            throw new IllegalArgumentException();
    }
}
