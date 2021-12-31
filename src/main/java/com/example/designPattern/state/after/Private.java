package com.example.designPattern.state.after;

public class Private implements State {

    private OnlineCourse onlineCourse;/* Context를 반드시 가지고 있어야 한다.*/

    public Private(OnlineCourse onlineCourse) {
        this.onlineCourse = onlineCourse;
    }

    @Override
    public void addReview(String review, Student student) {
        if (this.onlineCourse.getStudents().contains(student)) this.onlineCourse.getReviews().add(review);
        else throw new UnsupportedOperationException("프라이빗 코스를 수강하는 학생만 리뷰를 남길 수 있습니다.");
    }

    @Override
    public void addStudent(Student student) {
        if (student.isAvailable(this.onlineCourse)) this.onlineCourse.getStudents().add(student);
        else throw new UnsupportedOperationException("프라이빗 코스를 수강할 수 없습니다.");
    }
}
