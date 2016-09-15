package io.jp.stethosample;

import android.app.Application;

import io.jp.stetho.StethoBridge;

/**
 * @author jpwang
 * @since 9/15/16
 */
public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        StethoBridge.initialize(this);
    }
}
