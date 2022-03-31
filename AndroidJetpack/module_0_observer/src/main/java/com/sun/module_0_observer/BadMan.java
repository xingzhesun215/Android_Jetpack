package com.sun.module_0_observer;

import java.util.ArrayList;

/**
 * 小偷  被观察对象
 * 一旦做了坏事,警察会立马知道
 */
public class BadMan {

    private ArrayList<Police> policeMen = new ArrayList<>();

    public int badThing = 0;

    public void attach(Police police) {
        policeMen.add(police);
    }

    public void unAttach(Police police) {
        policeMen.remove(police);
    }

    public void doBadThings() {
        badThing++;
        notifyAllPoliceMen();
    }

    public String getBadThing() {
        return "我干了" + badThing + "件坏事";
    }

    public void notifyAllPoliceMen() {
        for (Police policeman : policeMen) {
            policeman.catchBadMan(badThing);
        }
    }


}
