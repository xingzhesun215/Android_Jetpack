package com.sun.lifecycledemo;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

@SuppressLint("RestrictedApi")
public class MyFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.myfragment, container, false);
        getLifecycle().addObserver(new MyLocationListener(getActivity(), "Fragment", null));
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("ME", "Fragment onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e("ME", "Fragment onPause");
    }
}
