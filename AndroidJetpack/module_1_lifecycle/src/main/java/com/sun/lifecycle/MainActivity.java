package com.sun.lifecycle;

import android.content.Intent;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.sun.common_library.arouter.ArouterPath;
import com.sun.common_library.base.BaseActivity;
import com.sun.common_library.util.LogUtil;

@Route(path = ArouterPath.Module_1_lifecycle_MainActivity)
public class MainActivity extends BaseActivity {

    private String TAG = "MainActivity";

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main1;
    }


    @Override
    protected void initView() {
        LogUtil.e(TAG, "onCreate");
        getLifecycle().addObserver(new CustomObserver());
    }

    @Override
    protected void initData() {

    }

    private Intent serviceIntent;

    /**
     * 打开服务
     *
     * @param view
     */
    public void openServiceClick(View view) {
        if (serviceIntent == null) {
            serviceIntent = new Intent(this, LifeService.class);
        }
        startService(serviceIntent);
    }

    /**
     * 关闭服务
     *
     * @param view
     */
    public void closeServiceClick(View view) {
        if (serviceIntent != null) {
            stopService(serviceIntent);
        }
    }


    @Override
    protected void onStart() {
        super.onStart();
        LogUtil.e(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        LogUtil.e(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        LogUtil.e(TAG, "onPause");
    }
    @Override
    protected void onStop() {
        super.onStop();
        LogUtil.e(TAG, "onStop");
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        LogUtil.e(TAG, "onDestroy");
    }
}