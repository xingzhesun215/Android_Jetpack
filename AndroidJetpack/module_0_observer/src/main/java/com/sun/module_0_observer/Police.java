package com.sun.module_0_observer;

/**
 * 警察部门
 */
public interface Police {

    void catchBadMan(int count);

    /**
     * 大喇叭,用来回调信息给activity
     */
    interface Horn {
        void speak(String message);
    }
}
