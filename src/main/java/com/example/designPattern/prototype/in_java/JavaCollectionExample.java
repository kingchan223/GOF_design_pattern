package com.example.designPattern.prototype.in_java;

import java.util.ArrayList;
import java.util.List;

public class JavaCollectionExample {
    public static void main(String[] args) {
        Student kevin = new Student("Kevin");
        Student alice = new Student("Alice");
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(kevin);
        students.add(alice);

        //위의 콜렉션을 복사해야 한다면
        List<Student> clone = new ArrayList<>(students);
        System.out.println(clone);
    }
}
