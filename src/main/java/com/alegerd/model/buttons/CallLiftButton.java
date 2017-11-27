package com.alegerd.model.buttons;

import com.alegerd.Direction;
import com.alegerd.model.Lift;
import com.alegerd.model.interfaces.ILift;

public class CallLiftButton implements ICallLiftButton{

    ILift lift;

    public CallLiftButton(ILift lift) {
        this.lift = lift;
    }

    @Override
    public void push(Direction direction) {
        lift.callingButtonPushed(direction);
    }
}