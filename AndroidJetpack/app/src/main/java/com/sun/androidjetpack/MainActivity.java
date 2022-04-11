package com.sun.androidjetpack;

import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.sun.common_library.arouter.ArouterPath;
import com.sun.common_library.base.BaseActivity;

@Route(path = ArouterPath.App_MainActivity)
public class MainActivity extends BaseActivity {


    @Override
    protected int getLayoutId() {
        return R.layout.activity_app_main;
    }

    @Override
    protected void initView() {
        if (!BuildConfig.isModule_0_observer) {
            this.findViewById(R.id.bt_module_0).setVisibility(View.VISIBLE);
            this.findViewById(R.id.bt_module_0).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ARouter.getInstance().build(ArouterPath.Module_0_observer_MainActivity).navigation();
                }
            });
        }
        if (!BuildConfig.isModule_1_lifecycle) {
            this.findViewById(R.id.bt_module_1).setVisibility(View.VISIBLE);
            this.findViewById(R.id.bt_module_1).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ARouter.getInstance().build(ArouterPath.Module_1_lifecycle_MainActivity).navigation();
                }
            });
        }
    }

    @Override
    protected void initData() {

    }
}