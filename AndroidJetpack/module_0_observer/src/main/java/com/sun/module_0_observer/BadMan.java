package com.sun.module_0_observer;

import java.util.ArrayList;

/**
 * 小偷  被观察对象
 * 一旦做了坏事,警察会立马知道
 */
public class BadMan {

    /**
     * 负责监控的警察,观察者对象
     */
    private ArrayList<Police> policeMen = new ArrayList<>();

    public int badThing = 0;

    /**
     * 警察开始盯防  观察者加入观察者队列
     *
     * @param police
     */
    public void attach(Police police) {
        policeMen.add(police);
    }

    /**
     * 警察停止盯防 观察者退出观察者队列
     *
     * @param police
     */
    public void unAttach(Police police) {
        policeMen.remove(police);
    }

    /**
     * 触发操作并通知依赖对象
     */
    public void doBadThings() {
        badThing++;
        notifyAllPoliceMen();
    }

    public String getBadThing() {
        return "我干了" + badThing + "件坏事";
    }

    /**
     * 通知观察者
     */
    public void notifyAllPoliceMen() {
        for (Police policeman : policeMen) {
            policeman.catchBadMan(badThing);
        }
    }
}
