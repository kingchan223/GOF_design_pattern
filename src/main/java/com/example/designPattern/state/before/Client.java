package com.example.designPattern.state.before;

public class Client {
    public static void main(String[] args) {
        Student lee = new Student("lee");
        OnlineCourse onlineCourse = new OnlineCourse();

        Student kim = new Student("kim");
        kim.addPrivateCourse(onlineCourse);

        onlineCourse.addStudent(lee);
        onlineCourse.changeState(OnlineCourse.State.PRIVATE);

        onlineCourse.addStudent(kim);
        onlineCourse.addReview("hello", lee);
        System.out.println(onlineCourse.getState());
        System.out.println(onlineCourse.getStudents());
        System.out.println(onlineCourse.getReviews());
    }
}
