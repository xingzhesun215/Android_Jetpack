package com.sun.lifecycledemo;


import android.app.Application;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ProcessLifeCycleOwner.get().getLifecycle().addObserver(new ApplicationObserver());
    }
}
