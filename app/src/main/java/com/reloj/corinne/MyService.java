package com.reloj.corinne;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;

import static android.util.Log.d;

public class MyService extends IntentService {
    public MyService(){
        super("MyService");
    }
    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log:d("4ITG", "Service is running...");
    }
}
