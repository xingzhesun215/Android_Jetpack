package com.sun.module_0_observer;

/**
 * 警察部门
 */
public interface Police {

    public BadMan badMan=null;
    public void catchBadMan(int count);

    public interface Horn{
        public void speak(String message);
    }
}
