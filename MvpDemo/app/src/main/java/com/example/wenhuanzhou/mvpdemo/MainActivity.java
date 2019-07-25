package com.example.wenhuanzhou.mvpdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity  implements ILoginView {

    private ILoginPresenter loginPresenter;
    private String name="nikeName";
    private String password="password";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginPresenter=new LoginPresenter(this);
        loginPresenter.loginToServer(name,password);


    }

    @Override
    public void loginSuccess(int state) {
       //处理登录成功后的状态
    }
}
