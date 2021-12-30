package com.example.designPattern.state.before;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class OnlineCourse {


    public enum State{ DRAFT, PUBLISHED, PRIVATE }
    private State state = State.DRAFT;
    private List<String> reviews = new ArrayList<>();
    private List<Student> students = new ArrayList<>();

    public void addReview(String review, Student student){
        //PUBLISHED 상태라면 누구나 리뷰 작성가능
        if(this.state == State.PUBLISHED) this.reviews.add(review);
        //PRIVATE 상태라면 해당 강의를 수강학 있는 학생만 리뷰작성 가능
        else if(this.state == State.PRIVATE && this.students.contains(student)) this.reviews.add(review);
        //DRAFT 상태라면 아무도 리뷰를 달 수 없음
        else throw new UnsupportedOperationException("드래프트 상태에서는 리뷰를 작성할 수 없습니다.");
    }

    public void addStudent(Student student){
        //DRAFT, PUBLISHED 상태에서는 학생을 추가가능
        if(this.state == State.DRAFT || this.state == State.PUBLISHED) this.students.add(student);
        //PRIVATE 상태에서는 해당 강의를 수강 중인 학생들만 추가가능
        else if(this.state==State.PRIVATE && availableTo(student)) this.students.add(student);
        //이외의 상태에서는 학생을 추가할 수 없다.
        else throw new UnsupportedOperationException("학생을 해당 수업에 참가시킬 수 없습니다.");

        if(this.students.size()>1) this.state = State.PRIVATE;
    }
    private boolean availableTo(Student student) {return students.contains(student);}
    public void changeState(State state) {this.state = state;}
}



