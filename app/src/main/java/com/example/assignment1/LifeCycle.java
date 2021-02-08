package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class LifeCycle extends AppCompatActivity {
    protected static final String tag="LifeCycle";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
      Log.d(tag,"OnCreated invoked");
    }
    protected void onStart() {
        super.onStart();
        Log.d(tag,"onStart invoked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(tag,"OnRestart invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag,"OnPause invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag,"OnResume invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag,"OnDestroy invoked");
    }
}