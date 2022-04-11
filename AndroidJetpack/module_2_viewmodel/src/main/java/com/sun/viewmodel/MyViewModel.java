package com.sun.viewmodel;

import androidx.lifecycle.ViewModel;

import com.sun.common_library.util.LogUtil;

public class MyViewModel extends ViewModel {

    private String TAG = "MyViewModel";

    public int viewModel_Int = 0;

    @Override
    protected void onCleared() {
        super.onCleared();
        LogUtil.e(TAG, "oncleared");
    }
}
