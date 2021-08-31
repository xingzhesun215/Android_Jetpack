package com.sun.lifecycledemo;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.util.Log;

public class MyServiceObserver implements LifecycleObserver {

    private String TAG=this.getClass().getName();

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void startGetLocation(){
        Log.e(TAG,"startGetLocation");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void stopGetLocation(){
        Log.e(TAG,"stopGetLocation");
    }
}
