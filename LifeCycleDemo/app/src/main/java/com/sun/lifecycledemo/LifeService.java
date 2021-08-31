package com.sun.lifecycledemo;

public class LifeService extends LifecycleService{

    private MyServiceObserver myServiceObserver;

    public LifeService(){
        myServiceObserver =new MyServiceObserver();
        getLifeCycle().addObserver(myServiceObserver);
    }
}
