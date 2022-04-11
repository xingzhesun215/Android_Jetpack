package com.sun.lifecycle.module;


import androidx.lifecycle.ProcessLifecycleOwner;

import com.sun.common_library.base.BaseApplication;
import com.sun.common_library.util.LogUtil;
import com.sun.lifecycle.CustomObserver;

public class MyApplication extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        LogUtil.e("MyApplication", "oncreate");
        ProcessLifecycleOwner.get().getLifecycle().addObserver(new CustomObserver());
    }
}
