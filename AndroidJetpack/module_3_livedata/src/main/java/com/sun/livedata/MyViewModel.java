package com.sun.livedata;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.sun.common_library.util.LogUtil;

import java.util.Timer;
import java.util.TimerTask;


public class MyViewModel extends ViewModel {

    private String TAG = "MyViewModel";
    public MutableLiveData<Integer> viewModel_Int = new MutableLiveData<>();
    public MutableLiveData<Integer> viewModel_Int2 = new MutableLiveData<>();
    private Timer timer;


    public void startTime() {
        if (timer == null) {
            viewModel_Int.setValue(0);
            timer = new Timer();
            TimerTask timerTask = new TimerTask() {
                @Override
                public void run() {
                    //这里要用postValue方法，而不能用setValue方法，否则会报线程异常错误
                    LogUtil.e(TAG,"当前value="+(viewModel_Int.getValue() + 1));
                    viewModel_Int.postValue(viewModel_Int.getValue() + 1);
                }
            };
            timer.schedule(timerTask, 1000, 1000);//延迟3秒执行
        }
    }


    @Override
    protected void onCleared() {
        super.onCleared();
        LogUtil.e(TAG, "oncleared");
//        timer.cancel();//暂不加这一句,看下页面destory还有没消息到activity上
    }
}
