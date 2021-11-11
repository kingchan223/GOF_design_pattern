package com.example.designPattern.abstractFactory.after;

import com.example.designPattern.abstractFactory.before.Handle;
import com.example.designPattern.abstractFactory.before.Wheel;

/*추상 팩토리*/
public interface CarPartsFactory {
    Handle createHandle();
    Wheel createWheel();
}
