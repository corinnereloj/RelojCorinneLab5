package com.reloj.corinne;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent i = new Intent(this, MyService.class);
        startService(i);
    }

    public void process(View v){
        Intent i = null, chooser = null;
        if(v.getId() == R.id.btnScreen2){
            i = new Intent(this, MainActivity.class);
            startActivity(i);
        }else if(v.getId() == R.id.btnMap2){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.623168, 121.055094"));
            chooser = Intent.createChooser(i, "Create a map");
            startActivity(chooser);
        }
    }
}
