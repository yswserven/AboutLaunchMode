package com.custom.launchmode.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.custom.launchmode.R;
import com.custom.launchmode.unit.MyLog;

import androidx.appcompat.app.AppCompatActivity;

public class D_Activity extends AppCompatActivity {
    private final String TAG = "Ysw";

    /**
     * singleInstance 启动模式--全局单列模式
     * 此启动模式是 singleTask 的加强版，拥有 singleTask 的所有特性，新增的特性是
     * 具有此种模式启动的 Activity 只能单独的位于一个任务栈中，栈内复用，此后均不会重新
     * 创建此 Activity 的实例，除非此栈被销毁，再次启动此 Activity 会执行的生命周期方法为
     * onPause、onNewInstance、onResume
     *
     * @author Ysw created at 2020/3/9 0:00
     */

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        MyLog.d(TAG, "D_Activity.onNewIntent：" + "");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d_);
        MyLog.d(TAG, "D_Activity.onCreate：" + "");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        MyLog.d(TAG, "D_Activity.onRestart：" + "");
    }

    @Override
    protected void onStart() {
        super.onStart();
        MyLog.d(TAG, "D_Activity.onStart：" + "");
    }

    @Override
    protected void onResume() {
        super.onResume();
        MyLog.d(TAG, "D_Activity.onResume：" + "");
    }


    @Override
    protected void onPause() {
        super.onPause();
        MyLog.d(TAG, "D_Activity.onPause：" + "");
    }

    @Override
    protected void onStop() {
        super.onStop();
        MyLog.d(TAG, "D_Activity.onStop：" + "");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        MyLog.d(TAG, "D_Activity.onDestroy：" + "");
    }

    public void jumpMain(View view) {
        startActivity(new Intent().setClass(D_Activity.this, MainActivity.class));
    }

    public void jumpA(View view) {
        startActivity(new Intent().setClass(D_Activity.this, A_Activity.class));
    }

    public void jumpB(View view) {
        startActivity(new Intent().setClass(D_Activity.this, B_Activity.class));
    }

    public void jumpC(View view) {
        startActivity(new Intent().setClass(D_Activity.this, C_Activity.class));
    }

    public void jumpD(View view) {
        startActivity(new Intent().setClass(D_Activity.this, D_Activity.class));
    }

    public void jumpE(View view) {
        startActivity(new Intent().setClass(D_Activity.this, E_Activity.class));
    }

    public void jumpF(View view) {
        startActivity(new Intent().setClass(D_Activity.this, F_Activity.class));
    }
}
