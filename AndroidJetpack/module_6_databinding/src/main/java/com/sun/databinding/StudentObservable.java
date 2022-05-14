package com.sun.databinding;

import android.text.TextUtils;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.library.baseAdapters.BR;

public class StudentObservable extends BaseObservable {

    public String name;

    public StudentObservable(String name) {
        this.name = name;
    }

    @Bindable
    public String getName(){
        return name;
    }

    public void setName(String name){
        if(!TextUtils.isEmpty(name)&&!this.name.equals(name)){
            this.name=name;
            notifyPropertyChanged(BR.name);
        }
    }

}
