package com.example.designPattern.facade.after;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EmailMessage {

    private String from;

    private String to;
    private String cc;
    private String bcc;

    private String subject;

    private String text;
}
