package com.example.wenhuanzhou.mvpdemo.factory;

/**
 * Created by wenhuanzhou on 2017/3/23.
 */
public class IMManager {

    public static class Factory{
        IManager imManager;
        public  IManager getInstance(){
            imManager=new IMManagerIpl();
            return  imManager;
        }
    }

}
