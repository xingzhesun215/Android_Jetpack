package com.sun.module_0_observer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.sun.common_library.arouter.ArouterPath;

@Route(path = ArouterPath.Module_0_observer_MainActivity)
public class MainActivity extends AppCompatActivity {

    private BadMan badMan;
    private Police police1;
    private Police police2;
    private Police police3;
    private TextView tv_policeman1;
    private TextView tv_policeman2;
    private TextView tv_policeman3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main0);
        tv_policeman1 = this.findViewById(R.id.tv_policeman1);
        tv_policeman2 = this.findViewById(R.id.tv_policeman2);
        tv_policeman3 = this.findViewById(R.id.tv_policeman3);
        badMan = new BadMan();
        police1 = new PoliceMan1(new Police.Horn() {
            @Override
            public void speak(String message) {
                tv_policeman1.setText(message);
            }
        });
        police2 = new PoliceMan2(new Police.Horn() {
            @Override
            public void speak(String message) {
                tv_policeman2.setText(message);
            }
        });
        police3 = new PoliceMan3(new Police.Horn() {
            @Override
            public void speak(String message) {
                tv_policeman3.setText(message);
            }
        });

    }

    public void doBadClick(View view) {
        badMan.doBadThings();
    }

    public void attach1Click(View view) {
        tv_policeman1.setText("派出所1已在监控坏人");
        badMan.attach(police1);
    }

    public void unAttach1Click(View view) {
        tv_policeman1.setText("派出所1没有在监控坏人");
        badMan.unAttach(police1);
    }

    public void attach2Click(View view) {
        tv_policeman2.setText("派出所2已在监控坏人");
        badMan.attach(police2);
    }

    public void unAttach2Click(View view) {
        tv_policeman2.setText("派出所2没有在监控坏人");
        badMan.unAttach(police2);
    }

    public void attach3Click(View view) {
        tv_policeman3.setText("派出所3已在监控坏人");
        badMan.attach(police3);
    }

    public void unAttach3Click(View view) {
        tv_policeman3.setText("派出所3没有在监控坏人");
        badMan.unAttach(police3);
    }

}