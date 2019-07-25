package com.example.wenhuanzhou.mvpdemo.factory;

/**
 * Created by wenhuanzhou on 2017/3/23.
 */
public class IMManagerIpl implements IManager {

    private  FriendManager friendManager;
    private  GroupManager groupManager;
    public IMManagerIpl(){

    }
    @Override
    public FriendManager getFriendManager() {
        return friendManager;
    }

    @Override
    public GroupManager getGroupManager() {
        return groupManager;
    }
}
