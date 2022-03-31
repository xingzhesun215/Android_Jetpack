package com.sun.module_0_observer;

public class PoliceMan3 implements Police {

    private Horn horn;

    public PoliceMan3(Horn horn) {
        this.horn = horn;
    }

    @Override
    public void catchBadMan(int count) {
        horn.speak("我是" + PoliceMan3.class.getSimpleName() + ",我看到坏人干坏事了" + count);
    }
}
