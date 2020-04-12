package com.custom.launchmode.unit;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

/**
 * Created by: Ysw on 2020/3/26.
 */
public class ActivityLifecycleOwner implements LifecycleObserver {
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    void lifecycleOnCreate() {
        Log.d("Ysw", "lifecycleOnCreate: 我被调用了");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    void lifecycleOnAny() {
        Log.d("Ysw", "lifecycleOnAny: 我被调用了");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    void lifecycleOnStart() {
        Log.d("Ysw", "lifecycleOnStart: 我被调用了");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    void lifecycleOnResume() {
        Log.d("Ysw", "lifecycleOnResume: 我被调用了");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    void lifecycleOnPause() {
        Log.d("Ysw", "lifecycleOnPause: 我被调用了");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    void lifecycleOnStop() {
        Log.d("Ysw", "lifecycleOnStop: 我被调用了");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    void lifecycleOnDestroy() {
        Log.d("Ysw", "lifecycleOnDestroy: 我被调用了");
    }

}
