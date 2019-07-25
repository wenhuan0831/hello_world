package com.example.wenhuanzhou.mvpdemo;

/**
 * Created by wenhuanzhou on 2017/3/8.
 */
public interface ILoginPresenter {
    void loginToServer(String name,String password);

     void loginSuccess(int status);
}
