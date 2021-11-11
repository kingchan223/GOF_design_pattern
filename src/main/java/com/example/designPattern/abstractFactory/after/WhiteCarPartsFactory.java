package com.example.designPattern.abstractFactory.after;

import com.example.designPattern.abstractFactory.before.Handle;
import com.example.designPattern.abstractFactory.before.Wheel;
import com.example.designPattern.abstractFactory.before.WhiteHandle;
import com.example.designPattern.abstractFactory.before.WhiteWheel;

public class WhiteCarPartsFactory implements CarPartsFactory{

    @Override
    public Handle createHandle() {
        return new WhiteHandle();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheel();
    }
}
