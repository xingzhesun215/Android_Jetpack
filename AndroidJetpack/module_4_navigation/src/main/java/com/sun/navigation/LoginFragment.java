package com.sun.navigation;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class LoginFragment extends Fragment {


    public LoginFragment() {
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View layoutView=inflater.inflate(R.layout.fragment_login, container, false);
        EditText et_phone=layoutView.findViewById(R.id.et_phone);
        layoutView.findViewById(R.id.bt_register).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle=new Bundle();
                bundle.putString("phone",et_phone.getText().toString());
                Navigation.findNavController(v).navigate(R.id.action_loginFragment_to_registerFragment,bundle);
            }
        });

        return layoutView;
    }
}