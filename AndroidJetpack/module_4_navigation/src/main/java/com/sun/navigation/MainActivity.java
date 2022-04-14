package com.sun.navigation;


import com.alibaba.android.arouter.facade.annotation.Route;
import com.sun.common_library.arouter.ArouterPath;
import com.sun.common_library.base.BaseActivity;

@Route(path = ArouterPath.Module_4_navigation_MainActivity)
public class MainActivity extends BaseActivity {


    @Override
    protected int getLayoutId() {
        return R.layout.activity_main4;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {
    }
}