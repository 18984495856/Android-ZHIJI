package com.example.lys.netinfomation.view;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.lys.netinfomation.R;
import com.example.lys.netinfomation.control.Login;
import com.example.lys.netinfomation.control.MangerControl;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button bt = (Button)findViewById(R.id.login_bt_login);
        bt.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            //登陆按钮
            case R.id.login_bt_login:
                String id,password;
                EditText et1 = (EditText)findViewById(R.id.login_edit_id);
                EditText et2 = (EditText)findViewById(R.id.login_edit_password);
                id = et1.getText().toString();
                password = et2.getText().toString();
                //登陆账号
                if(Login.LoginUser(id,password).isOK()){
                    //成功
                }else{
                    //失败
                }
                break;
        }
    }
}
