package com.example.wenhuanzhou.mvpdemo;

/**
 * Created by wenhuanzhou on 2017/3/8.
 */
public class LoginPresenter implements ILoginPresenter {

    private ILoginModel iLoginModel;
    private ILoginView iLoginView;
    public LoginPresenter(ILoginView loginView){
        iLoginModel=new LoginModel(this);
        this.iLoginView=loginView;
    }
    @Override
    public void loginToServer(String name, String password) {
        iLoginModel.loginServer(name,password);
    }

    @Override
    public void loginSuccess(int status) {
        iLoginView.loginSuccess(1);
    }

}
