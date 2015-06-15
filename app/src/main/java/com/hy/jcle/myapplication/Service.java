package com.hy.jcle.myapplication;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by jcle on 6/15/2015.
 */
public class Service extends android.app.Service {

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.e("hw", "onStartCommand");
        AlertDialog.Builder builder=new AlertDialog.Builder(getApplicationContext());
        builder.setTitle("Adx");
        Log.e("hw", "OnCreateDialog");
        AlertDialog alert=builder.create();
        alert.getWindow().setType(WindowManager.LayoutParams.TYPE_SYSTEM_ALERT);
        alert.show();
        Log.e("hw","ShowDialog");
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
