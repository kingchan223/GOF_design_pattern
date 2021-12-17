package com.example.designPattern.bridge.before;

import com.example.designPattern.bridge.before.Champion;

public class PoolParty아리 implements Champion {
    @Override
    public void move() {
        System.out.println("PoolParty아리 move");
    }

    @Override
    public void skillQ() {
        System.out.println("PoolParty아리 Q");
    }

    @Override
    public void skillW() {
        System.out.println("PoolParty아리 W");
    }

    @Override
    public void skillE() {
        System.out.println("PoolParty아리 E");
    }

    @Override
    public void skillR() {
        System.out.println("PoolParty아리 R");
    }
}
