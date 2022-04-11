package com.sun.lifecycle;

import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LifecycleService;

import com.sun.common_library.util.LogUtil;

public class LifeService extends LifecycleService {
    private String TAG = "LifeService";
    private CustomObserver observer;

    public LifeService() {
        observer = new CustomObserver();
        // 将观察者和被观察者绑定
        getLifecycle().addObserver(observer);
    }


    @Override
    public void onCreate() {
        super.onCreate();
        LogUtil.e(TAG, "onCreate");
    }

    @Override
    public int onStartCommand(@Nullable Intent intent, int flags, int startId) {
        LogUtil.e(TAG, "onStartCommand");
        return super.onStartCommand(intent, flags, startId);
    }

    @Nullable
    @Override
    public IBinder onBind(@NonNull Intent intent) {
        LogUtil.e(TAG, "onBind");
        return super.onBind(intent);
    }

    @Override
    public boolean onUnbind(Intent intent) {
        LogUtil.e(TAG, "onUnbind");
        return super.onUnbind(intent);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        LogUtil.e(TAG, "onDestroy");
    }
}
