package com.example.designPattern.builderPattern.before;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class DetailPlan {

    private int day;

    private String plan;

    public DetailPlan(int day, String plan) {
        this.day = day;
        this.plan = plan;
    }
}
