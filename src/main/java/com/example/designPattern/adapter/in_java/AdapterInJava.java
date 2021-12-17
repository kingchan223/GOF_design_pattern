package com.example.designPattern.adapter.in_java;


import java.util.*;

public class AdapterInJava {

    public static void main(String[] args) {
/*
        "a", "b", "c"    ==> adaptee
        Arrays.asList()  ==> adapter
        List<String>     ==> target 인터페이스                                                                    */
        List<String> list = Arrays.asList("a", "b", "c");//배열을 리스트로 바꿔준다.

/*
                   list            ==> adaptee
        Collections.enumeration()  ==> adapter
        Enumeration<String>        ==> target 인터페이스                                                           */
        Enumeration<String> enumeration = Collections.enumeration(list);//list를 Enumeration으로 바꿔준다.

        ArrayList<String> list2 = Collections.list(enumeration);//Enumeration을 list로 바꿔준다.
    }
}
