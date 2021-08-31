package com.sun.lifecycledemo;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.util.Log;

public class ApplicationObserver implements LifecycleObserver {


    private final String TAG="Application_Observer";

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void oncreate(){
        Log.e(TAG,"oncreate");
    }


    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart(){
    Log.e(TAG,"在前台时显示");

    }
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onresume(){
        Log.e(TAG,"前台出现时调用");
    }




    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onpause(){
        Log.e(TAG,"onpause");
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onstop(){
        Log.e(TAG,"onstop");
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void ondestory(){
        Log.e(TAG,"ondestoryßßß");
    }
}
