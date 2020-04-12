package com.custom.launchmode.viewmodel;

import com.custom.launchmode.model.User;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * Created by: Ysw on 2020/3/26.
 */
public class MineModel extends ViewModel {
    public MutableLiveData<User> mUserLiveData = new MutableLiveData<>();

    public MineModel() {
        doSomeThing();
    }

    public void  doSomeThing(){
        User user = new User();
        user.setAge(100);
        user.setName("这个是ViewModel设置的名字");
        mUserLiveData.postValue(user);
    }

    public void doOtherThing(){
        User user = new User();
        user.setAge(10000);
        user.setName("ViewModel的名字");
        mUserLiveData.setValue(user);
    }

}
