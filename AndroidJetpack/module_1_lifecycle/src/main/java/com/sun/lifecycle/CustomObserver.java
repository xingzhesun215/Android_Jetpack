package com.sun.lifecycle;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

import com.sun.common_library.util.LogUtil;

/**
 * 具有感知Activity/fragment/service/application生命周期的能力
 * 说白了就是创建了一个观察者,只要它看向哪个对象,就能知道那个对象的生命周期到那了
 * 这样就能选择性的在不同的生命周期做不同的操作,从而和activity/fragment/service/application实现解耦
 */
public class CustomObserver implements LifecycleObserver {

    private final String TAG = "CustomObserver";

    @OnLifecycleEvent(value = Lifecycle.Event.ON_RESUME)
    public void onResume() {
        LogUtil.e(TAG, "Observer ON_RESUME");
        //TODO 做些操作
    }

    @OnLifecycleEvent(value = Lifecycle.Event.ON_START)
    public void onStart() {
        LogUtil.e(TAG, "Observer ON_START");
        //TODO 做些操作
    }

    @OnLifecycleEvent(value = Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        LogUtil.e(TAG, "Observer ON_CREATE");
        //TODO 做些操作
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        LogUtil.e(TAG, "Observer ON_PAUSE");
        //TODO 做些操作
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestory() {
        LogUtil.e(TAG, "Observer ON_DESTROY");
        //TODO 做些操作
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
        LogUtil.e(TAG, "Observer ON_STOP");
        //TODO 做些操作
    }

//    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
//    public void onAny() {
//        LogUtil.e(TAG, "Observer ON_ANY  只要上面有调用,此方法也会调用");
//    }

}
