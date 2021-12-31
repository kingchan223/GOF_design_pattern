package com.example.designPattern.state.after;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

@Getter
public class OnlineCourse {

    private State state = new Draft(this);
    private List<Student> students = new ArrayList<>();
    private List<String> reviews = new ArrayList<>();

    public void addStudent(Student student) {
        this.state.addStudent(student);
    }

    public void addReview(String review, Student student) {
        this.state.addReview(review, student);
    }

    public void changeState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return students.stream().map(Student::getName).collect(joining(", "));
    }
}
