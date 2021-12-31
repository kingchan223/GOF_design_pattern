package com.example.designPattern.state.after;

public class Published implements State {

    private OnlineCourse onlineCourse;/* Context를 반드시 가지고 있어야 한다.*/

    public Published(OnlineCourse onlineCourse) {
        this.onlineCourse = onlineCourse;
    }

    @Override
    public void addReview(String review, Student student) {
        this.onlineCourse.getReviews().add(review);
    }

    @Override
    public void addStudent(Student student) {
        this.onlineCourse.getStudents().add(student);
    }
}
