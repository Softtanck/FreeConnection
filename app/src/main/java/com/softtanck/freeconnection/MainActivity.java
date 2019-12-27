package com.softtanck.freeconnection;

import androidx.appcompat.app.AppCompatActivity;

import android.net.ProxyInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.softtanck.sharedlibrary.FreeCore;

/**
 * Created by Tanck
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = MainActivity.class.getSimpleName();
    private Button openConnection, closeConnection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        openConnection  = findViewById(R.id.btn_open_fun);
        closeConnection = findViewById(R.id.btn_close_fun);
        openConnection. setOnClickListener(this);
        closeConnection.setOnClickListener(this);
    }

    // TODO : Test method should be removed
    @Override
    protected void onResume() {
        super.onResume();
        ProxyInfo globalProxyInfo = FreeCore.getCore().getGlobalProxyInfo();
        Log.d(TAG, "The proxy info is : " + globalProxyInfo);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_open_fun:
                // TODO : Invoke the function of open
                break;
            case R.id.btn_close_fun:
                // TODO : Invoke the function of close
                break;
            default:
                break;
        }
    }
}
