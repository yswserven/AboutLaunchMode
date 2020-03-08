package com.custom.launchmode.app;

import android.app.Application;

import com.custom.launchmode.unit.MyLog;

/**
 * Created by: Ysw on 2020/3/8.
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        MyLog.init();
    }
}
