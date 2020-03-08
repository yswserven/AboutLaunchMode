package com.custom.launchmode.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.custom.launchmode.R;
import com.custom.launchmode.unit.MyLog;

import androidx.appcompat.app.AppCompatActivity;

public class A_Activity extends AppCompatActivity {
    private final String TAG = "Ysw";

    /**
     * standard 默认标准模式：
     * 就是默认启动模式，当你启动一个新的Activity的时候，这个新Activity的生命周期会执行 onCreate、onStart、onResume
     * 旧的Activity会执行 onPause onStop 方法，总体执行顺序如下：
     * 旧 onPause、 新 onCreate、 新 onStart、 新 onResume、 旧 onStop
     *
     * @author Ysw created at 2020/3/8 22:21
     */

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        MyLog.d(TAG, "A_Activity.onNewIntent：" + "");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_);
        MyLog.d(TAG, "A_Activity.onCreate：" + "");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        MyLog.d(TAG, "A_Activity.onRestart：" + "");
    }

    @Override
    protected void onStart() {
        super.onStart();
        MyLog.d(TAG, "A_Activity.onStart：" + "");
    }

    @Override
    protected void onResume() {
        super.onResume();
        MyLog.d(TAG, "A_Activity.onResume：" + "");
    }


    @Override
    protected void onPause() {
        super.onPause();
        MyLog.d(TAG, "A_Activity.onPause：" + "");
    }

    @Override
    protected void onStop() {
        super.onStop();
        MyLog.d(TAG, "A_Activity.onStop：" + "");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        MyLog.d(TAG, "A_Activity.onDestroy：" + "");
    }

    public void jumpMain(View view) {
        startActivity(new Intent().setClass(A_Activity.this, MainActivity.class));
    }

    public void jumpA(View view) {
        startActivity(new Intent().setClass(A_Activity.this, A_Activity.class));
    }

    public void jumpB(View view) {
        startActivity(new Intent().setClass(A_Activity.this, B_Activity.class));
    }

    public void jumpC(View view) {
        startActivity(new Intent().setClass(A_Activity.this, C_Activity.class));
    }

    public void jumpD(View view) {
        startActivity(new Intent().setClass(A_Activity.this, D_Activity.class));
    }

    public void jumpE(View view) {
        startActivity(new Intent().setClass(A_Activity.this, E_Activity.class));
    }

    public void jumpF(View view) {
        startActivity(new Intent().setClass(A_Activity.this, F_Activity.class));
    }
}
