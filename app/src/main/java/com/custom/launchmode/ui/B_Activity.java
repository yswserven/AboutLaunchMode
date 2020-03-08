package com.custom.launchmode.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.custom.launchmode.R;
import com.custom.launchmode.unit.MyLog;

import androidx.appcompat.app.AppCompatActivity;

public class B_Activity extends AppCompatActivity {
    private final String TAG = "Ysw";

    /**
     * singleTop 启动模式
     * 如果此 Activity 还未启动，则开启这个 Activity 时会执行的生命周期方法和 Standard 的模式是一样的
     * 如果此 Activity 已经启动，并且在其栈的栈顶，则再次开启这个 Activity 时会执行此 Activity 的 onPause、 onNewIntent、onResume 方法
     * 如果此 Activity 已经启动，但不再其栈的栈顶，则再次开启这个 Activity 时会执行的生命周期方法和 Standard 的模式是一样的
     *
     * @author Ysw created at 2020/3/8 22:26
     */

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        MyLog.d(TAG, "B_Activity.onNewIntent：" + "");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_);
        MyLog.d(TAG, "B_Activity.onCreate：" + "");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        MyLog.d(TAG, "B_Activity.onRestart：" + "");
    }

    @Override
    protected void onStart() {
        super.onStart();
        MyLog.d(TAG, "B_Activity.onStart：" + "");
    }

    @Override
    protected void onResume() {
        super.onResume();
        MyLog.d(TAG, "B_Activity.onResume：" + "");
    }


    @Override
    protected void onPause() {
        super.onPause();
        MyLog.d(TAG, "B_Activity.onPause：" + "");
    }

    @Override
    protected void onStop() {
        super.onStop();
        MyLog.d(TAG, "B_Activity.onStop：" + "");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        MyLog.d(TAG, "B_Activity.onDestroy：" + "");
    }

    public void jumpMain(View view) {
        startActivity(new Intent().setClass(B_Activity.this, MainActivity.class));
    }

    public void jumpA(View view) {
        startActivity(new Intent().setClass(B_Activity.this, A_Activity.class));
    }

    public void jumpB(View view) {
        startActivity(new Intent().setClass(B_Activity.this, B_Activity.class));
    }

    public void jumpC(View view) {
        startActivity(new Intent().setClass(B_Activity.this, C_Activity.class));
    }

    public void jumpD(View view) {
        startActivity(new Intent().setClass(B_Activity.this, D_Activity.class));
    }

    public void jumpE(View view) {
        startActivity(new Intent().setClass(B_Activity.this, E_Activity.class));
    }

    public void jumpF(View view) {
        startActivity(new Intent().setClass(B_Activity.this, F_Activity.class));
    }
}
