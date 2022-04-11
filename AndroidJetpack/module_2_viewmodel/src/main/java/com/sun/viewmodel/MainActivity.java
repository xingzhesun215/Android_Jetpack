package com.sun.viewmodel;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProvider;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.sun.common_library.arouter.ArouterPath;
import com.sun.common_library.base.BaseActivity;
import com.sun.common_library.util.LogUtil;

@Route(path = ArouterPath.Module_2_viewmodel_MainActivity)
public class MainActivity extends BaseActivity {
    private String TAG = "ViewModel_Main";

    private TextView tv_local;
    private TextView tv_viewmodel;
    MyViewModel viewModel;

    int local_Int = 0;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main2;
    }

    @Override
    protected void initView() {
        tv_local = this.findViewById(R.id.tv_local);
        tv_viewmodel = this.findViewById(R.id.tv_viewmodel);
        viewModel = new ViewModelProvider(this).get(MyViewModel.class);
        LogUtil.e(TAG, "activity=" + this);
        LogUtil.e(TAG, "viewmodelstore=" + getViewModelStore());
        LogUtil.e(TAG, "viewmodel=" + viewModel.toString());
        setText();
    }

    @Override
    protected void initData() {

    }

    @Nullable
    @Override
    public Object getLastNonConfigurationInstance() {
        LogUtil.e(TAG,"getLastNonConfigurationInstance");
        return super.getLastNonConfigurationInstance();
    }


    public void changeClick(View view) {
        viewModel.viewModel_Int++;
        this.local_Int++;
        setText();
    }

    public void setText() {
        tv_local.setText(local_Int+"");
        tv_viewmodel.setText(viewModel.viewModel_Int+"");

        LogUtil.e(TAG, "local-Int=" + local_Int + "   viewmodel-Int=" + viewModel.viewModel_Int);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        LogUtil.e(TAG, "onDestroy");
    }
}