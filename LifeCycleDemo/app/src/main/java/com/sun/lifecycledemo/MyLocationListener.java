package com.sun.lifecycledemo;

import android.app.Activity;
import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

public class MyLocationListener implements LifecycleObserver {


    private String tag;
    public MyLocationListener(Activity context,String tag, OnLocationChangeListener listener){
        this.tag=tag;

    }
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    private void startLocation(){
        Log.e("ME","Location LifeCycle onResume");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    private void stopLocation(){
        Log.e("ME","Location LifeCycle onPause");
    }

    public interface OnLocationChangeListener{
        void onChanged(double lat,double lon);
    }
}
