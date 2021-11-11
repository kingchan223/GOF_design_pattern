package com.example.designPattern.abstractFactory.after;

import com.example.designPattern.abstractFactory.before.WhiteHandle;

public class ProWhiteHandle extends WhiteHandle {

    public void proHandleLogic(){
        System.out.println("pro만의 추가된 기능");
    }
}
