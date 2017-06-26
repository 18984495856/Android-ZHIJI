package com.example.lys.netinfomation.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.lys.netinfomation.R;
import com.example.lys.netinfomation.control.FactoryView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //跳转至登陆窗口
        FactoryView.toView(this,LoginActivity.class);

    }


}

