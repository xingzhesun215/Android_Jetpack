package com.sun.viewbinding;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;

import com.sun.viewbinding.databinding.FragmentHelloBinding;

public class HelloFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        FragmentHelloBinding binding = FragmentHelloBinding.inflate(inflater, container, false);
        binding.tvFragmentHello.setText("hello,I am hanmeimei in Fragment");
        return binding.getRoot();
    }
}
