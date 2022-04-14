package com.sun.navigation;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class RegisterFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    private static final String PHONE = "phone";

    // TODO: Rename and change types of parameters
    private String phone;

    public RegisterFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            phone = getArguments().getString(PHONE);
        }
        Log.e("ME","MainActvity is same getActivity ? "+(getActivity() instanceof MainActivity));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View layoutView=inflater.inflate(R.layout.fragment_register, container, false);
        TextView tv_phone=layoutView.findViewById(R.id.tv_phone);
        tv_phone.setText(phone);
        return layoutView;
    }
}