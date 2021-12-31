package com.example.designPattern.state.after;

import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

@ToString
public class Student {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    private Set<OnlineCourse> onlineCourses = new HashSet<>();

    public boolean isAvailable(OnlineCourse onlineCourse) {
        return onlineCourses.contains(onlineCourse);
    }

    public void addPrivate(OnlineCourse onlineCourse) {
        this.onlineCourses.add(onlineCourse);
    }

    public String getName() {return name;}
}
