package com.sun.androidjetpack;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.sun.common_library.arouter.ArouterPath;
import com.sun.common_library.base.BaseActivity;

@Route(path = ArouterPath.App_MainActivity)
public class MainActivity extends BaseActivity {


    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        if(!BuildConfig.isModule_0_observer){
            ARouter.getInstance().build(ArouterPath.Module_0_observer_MainActivity).navigation();
        }
    }

    @Override
    protected void initData() {

    }
}