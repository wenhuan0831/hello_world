package com.example.wenhuanzhou.mvpdemo;


import android.os.Handler;
import android.os.Message;

/**
 * Created by wenhuanzhou on 2017/3/8.
 */
public class LoginModel implements ILoginModel {
    ILoginPresenter iLoginPresenter;

    private static Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
        }
    };
    public LoginModel (ILoginPresenter loginPresenter){
        this.iLoginPresenter=loginPresenter;
    }
    @Override
    public void loginServer(String name, String password) {
     handler.postDelayed(new Runnable() {
         @Override
         public void run() {
             //
             int status=1;
             iLoginPresenter.loginSuccess(status);
         }
     },1000);
    }
}
