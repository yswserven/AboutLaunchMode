package com.custom.launchmode.ui;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.custom.launchmode.R;
import com.custom.launchmode.model.User;
import com.custom.launchmode.unit.ActivityLifecycleOwner;
import com.custom.launchmode.unit.MyLog;
import com.custom.launchmode.viewmodel.MineModel;

import java.util.List;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "Ysw";
    private MineModel model;

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        MyLog.d(TAG, "MainActivity.onNewIntent：" + "");
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getLifecycle().addObserver(new ActivityLifecycleOwner());
        MyLog.d(TAG, "MainActivity.onCreate：" + "");
        getTaskInfo();
        model = getDefaultViewModelProviderFactory().create(MineModel.class);
        model.mUserLiveData.observe(this, new Observer<User>() {
            @Override
            public void onChanged(User user) {
                Log.d("Ysw", "onChanged: user = " + user.toString());
            }
        });
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        MyLog.d(TAG, "MainActivity.onRestart：" + "");
    }

    @Override
    protected void onStart() {
        super.onStart();
        MyLog.d(TAG, "MainActivity.onStart：" + "");
    }

    @Override
    protected void onResume() {
        super.onResume();
        MyLog.d(TAG, "MainActivity.onResume：" + "");
    }


    @Override
    protected void onPause() {
        super.onPause();
        MyLog.d(TAG, "MainActivity.onPause：" + "");
    }

    @Override
    protected void onStop() {
        super.onStop();
        MyLog.d(TAG, "MainActivity.onStop：" + "");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        MyLog.d(TAG, "MainActivity.onDestroy：" + "");
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void getTaskInfo() {
        ActivityManager activityManager = (ActivityManager) getSystemService(Context.ACTIVITY_SERVICE);
        List<ActivityManager.AppTask> appTasks = activityManager.getAppTasks();
        for (ActivityManager.AppTask appTask : appTasks) {
            ActivityManager.RecentTaskInfo taskInfo = appTask.getTaskInfo();
            MyLog.d(TAG, "MainActivity.getTaskInfo：taskId = " + taskInfo.toString());
        }
    }

    public void jumpMain(View view) {
        startActivity(new Intent().setClass(MainActivity.this, MainActivity.class));
    }

    public void jumpA(View view) {
        startActivity(new Intent().setClass(MainActivity.this, A_Activity.class));
        model.doOtherThing();
    }

    public void jumpB(View view) {
        startActivity(new Intent().setClass(MainActivity.this, B_Activity.class));
    }

    public void jumpC(View view) {
        startActivity(new Intent().setClass(MainActivity.this, C_Activity.class));
    }

    public void jumpD(View view) {
        startActivity(new Intent().setClass(MainActivity.this, D_Activity.class));
    }

    public void jumpE(View view) {
        startActivity(new Intent().setClass(MainActivity.this, E_Activity.class));
    }

    public void jumpF(View view) {
//        startActivity(new Intent().setClass(MainActivity.this, F_Activity.class));
        startActivity(new Intent().setClass(MainActivity.this, RecyclerViewActivity.class));
    }
}
