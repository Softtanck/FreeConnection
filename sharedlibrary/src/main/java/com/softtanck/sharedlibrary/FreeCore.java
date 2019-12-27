package com.softtanck.sharedlibrary;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.ProxyInfo;
import android.util.Log;

import com.softtanck.sharedlibrary.utils.ReflectionUtilities;

/**
 * Current name : FreeCore in `FreeConnection`
 * <p>
 * Created by Tanck on 2019-12-27 17:31.
 * <p>
 * Note : N/A
 */
// TODO : The core of free connection
public class FreeCore {

    private static final String TAG = FreeCore.class.getSimpleName();
    private static FreeCore freeCoreInstance;

    private ConnectivityManager connectivityManager;

    public static synchronized FreeCore getCore() {
        synchronized (FreeCore.class) {
            if (freeCoreInstance == null) freeCoreInstance = new FreeCore();
        }
        return freeCoreInstance;
    }

    private FreeCore() {}

    public void initEnv(Context context) {
        this.connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
    }

    public ProxyInfo getGlobalProxyInfo() {
        try {
            return ReflectionUtilities.getInstance().getAndroidGlobalProxyInfo(connectivityManager);
        } catch (IllegalAccessException e) {
            Log.e(TAG,"Get global proxy info failed", e);
            e.printStackTrace();
        }
        return null;
    }

}
