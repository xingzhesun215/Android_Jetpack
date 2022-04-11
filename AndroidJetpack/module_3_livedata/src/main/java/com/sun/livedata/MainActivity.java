package com.sun.livedata;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.sun.common_library.arouter.ArouterPath;
import com.sun.common_library.base.BaseActivity;
import com.sun.common_library.util.LogUtil;

@Route(path = ArouterPath.Module_3_livedata_MainActivity)
public class MainActivity extends BaseActivity {
    private String TAG = "ViewModel_Main";

    private TextView tv_viewmodel;
    MyViewModel viewModel;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main3;
    }

    @Override
    protected void initView() {
        tv_viewmodel = this.findViewById(R.id.tv_viewmodel);
        viewModel = new ViewModelProvider(this).get(MyViewModel.class);
        tv_viewmodel.setText(viewModel.viewModel_Int.getValue()+"");
        viewModel.viewModel_Int.observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                LogUtil.e(TAG,"onChanged1="+integer);
                tv_viewmodel.setText(integer+"");
            }
        });
        viewModel.viewModel_Int2.observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                LogUtil.e(TAG,"onChanged2="+integer);
            }
        });
    }

    @Override
    protected void initData() {

    }

    public void changeClick(View view) {
        viewModel.startTime();
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        LogUtil.e(TAG, "onDestroy");
    }
}