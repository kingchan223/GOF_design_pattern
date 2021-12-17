package com.example.designPattern.bridge.after;

import com.example.designPattern.bridge.after.champion.아리;
import com.example.designPattern.bridge.after.skin.KDA;
import com.example.designPattern.bridge.after.skin.PoolParty;
import com.example.designPattern.bridge.before.Champion;

public class App {
    public static void main(String[] args) {
        Champion kda아리 = new 아리(new KDA());
        kda아리.skillQ();
        kda아리.skillW();

        Champion poolparty아리 = new 아리(new PoolParty());
        poolparty아리.skillQ();
        poolparty아리.skillW();
    }
}
