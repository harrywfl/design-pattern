package com.design.pattern.state;

/**
 * @Author: 98050
 * @Time: 2019-01-18 22:11
 * @Feature:
 */
public class StopState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Stop State";
    }
}
