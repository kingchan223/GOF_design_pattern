package com.example.designPattern.state.after;

public class Client {
    public static void main(String[] args) {
        OnlineCourse onlineCourse = new OnlineCourse();
        Student lee = new Student("lee");
        Student kim = new Student("kim");
        kim.addPrivate(onlineCourse);

        onlineCourse.addStudent(lee);

        onlineCourse.changeState(new Draft(onlineCourse));

        onlineCourse.addReview("hello 리뷰입니다.", lee);

        onlineCourse.addStudent(kim);

        System.out.println(onlineCourse.getState());
        System.out.println(onlineCourse.getReviews());
        System.out.println(onlineCourse.getStudents());
    }
}
