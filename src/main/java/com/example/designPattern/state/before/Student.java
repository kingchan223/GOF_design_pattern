package com.example.designPattern.state.before;

import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    private List<OnlineCourse> onlineCourses = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public void addPrivateCourse(OnlineCourse onlineCourse) {
        this.onlineCourses.add(onlineCourse);
    }
}
