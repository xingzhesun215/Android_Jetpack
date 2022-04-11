package com.sun.module_0_observer;

public class PoliceMan1 implements Police {
    //大喇叭对象,用来回调到页面上
    private Horn horn;

    public PoliceMan1(Horn horn) {
        this.horn = horn;
    }

    //收到被观察者通知,并用喇叭通知页面,看到结果
    @Override
    public void catchBadMan(int count) {
        horn.speak("我是" + PoliceMan1.class.getSimpleName() + ",我看到坏人干坏事了" + count);
    }
}
