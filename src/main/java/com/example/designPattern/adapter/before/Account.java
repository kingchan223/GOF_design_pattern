package com.example.designPattern.adapter.before;

import lombok.Getter;
import lombok.Setter;

//adaptee
@Getter
@Setter
public class Account {//어플리케이션에서 만드는 account domain
    private String name;
    private String password;
    private String email;
}




