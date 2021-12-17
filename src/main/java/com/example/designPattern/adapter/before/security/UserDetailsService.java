package com.example.designPattern.adapter.before.security;

//target
public interface UserDetailsService {
    UserDetails loadUser(String username);
}
