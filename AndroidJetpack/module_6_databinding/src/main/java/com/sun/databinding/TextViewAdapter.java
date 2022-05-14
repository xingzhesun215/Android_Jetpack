package com.sun.databinding;

import android.widget.TextView;

import androidx.databinding.BindingAdapter;

public class TextViewAdapter {

    @BindingAdapter("android:text1")
    public static void setText(TextView view, CharSequence text) {
        //省略特殊处理...
        view.setText(text + " over");
    }
}
