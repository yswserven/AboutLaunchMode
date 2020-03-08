package com.custom.launchmode.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.custom.launchmode.R;
import com.custom.launchmode.unit.MyLog;

import androidx.appcompat.app.AppCompatActivity;

public class E_Activity extends AppCompatActivity {
    private final String TAG = "Ysw";

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        MyLog.d(TAG, "E_Activity.onNewIntent：" + "");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e_);
        MyLog.d(TAG, "E_Activity.onCreate：" + "");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        MyLog.d(TAG, "E_Activity.onRestart：" + "");
    }

    @Override
    protected void onStart() {
        super.onStart();
        MyLog.d(TAG, "E_Activity.onStart：" + "");
    }

    @Override
    protected void onResume() {
        super.onResume();
        MyLog.d(TAG, "E_Activity.onResume：" + "");
    }


    @Override
    protected void onPause() {
        super.onPause();
        MyLog.d(TAG, "E_Activity.onPause：" + "");
    }

    @Override
    protected void onStop() {
        super.onStop();
        MyLog.d(TAG, "E_Activity.onStop：" + "");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        MyLog.d(TAG, "E_Activity.onDestroy：" + "");
    }

    public void jumpMain(View view) {
        startActivity(new Intent().setClass(E_Activity.this, MainActivity.class));
    }

    public void jumpA(View view) {
        startActivity(new Intent().setClass(E_Activity.this, A_Activity.class));
    }

    public void jumpB(View view) {
        startActivity(new Intent().setClass(E_Activity.this, B_Activity.class));
    }

    public void jumpC(View view) {
        startActivity(new Intent().setClass(E_Activity.this, C_Activity.class));
    }

    public void jumpD(View view) {
        startActivity(new Intent().setClass(E_Activity.this, D_Activity.class));
    }

    public void jumpE(View view) {
        startActivity(new Intent().setClass(E_Activity.this, E_Activity.class));
    }

    public void jumpF(View view) {
        startActivity(new Intent().setClass(E_Activity.this, F_Activity.class));
    }
}
