package com.example.designPattern.abstractFactory.after;

import com.example.designPattern.abstractFactory.before.Handle;
import com.example.designPattern.abstractFactory.before.Wheel;
import com.example.designPattern.abstractFactory.before.WhiteHandle;
import com.example.designPattern.abstractFactory.before.WhiteWheel;

public class WhiteCarPartsProFactory implements CarPartsFactory{

    @Override
    public Handle createHandle() {
        return new ProWhiteHandle();
    }

    @Override
    public Wheel createWheel() {
        return new ProWhiteWheel();
    }
}
