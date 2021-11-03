package com.hyeonwoo.free;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (BuildConfig.PRO_VERSION) {
            Log.d("MainActivity", "Pro Version");
        } else {
            Log.d("MainActivity", "Free Version");
        }
    }
}