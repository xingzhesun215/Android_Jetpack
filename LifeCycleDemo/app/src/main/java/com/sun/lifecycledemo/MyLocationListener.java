package com.sun.lifecycledemo;

import android.app.Activity;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

public class MyLocationListener implements LifecycleObserver {
    public MyLocationListener(Activity context, OnLocationChangeListener listener){


    }
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    private void startLocation(){

    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    private void stopLocation(){

    }

    public interface OnLocationChangeListener{
        void onChanged(double lat,double lon);
    }
}
