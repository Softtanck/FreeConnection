package com.softtanck.freeconnection;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;

import com.softtanck.sharedlibrary.FreeCore;

/**
 * Current name : FreeConnectionApp in `FreeConnection`
 * <p>
 * Created by Tanck on 2019-12-27 17:33.
 * <p>
 * Note : N/A
 */
public class FreeConnectionApp extends Application {

    // The global context
    @SuppressLint("StaticFieldLeak")
    private static Context context;

    public static Context getContext() {
        return context;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        // TODO : Do some init methods at here
        context = this;

        FreeCore.getCore().initEnv(this);
    }
}
