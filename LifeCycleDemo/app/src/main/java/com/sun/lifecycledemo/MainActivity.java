package com.sun.lifecycledemo;


import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

/**
 * LifeCycle onResume在acticity onResume之后执行
 * LifeCycle onPause在activity onPause之前执行
 */
public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getLifecycle().addObserver(new MyLocationListener(this,"MainActivity",null));


    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("ME","Main onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("ME","Main onPause");
    }
}