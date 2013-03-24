package com.example;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    private MainActivitySurfaceView mView;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mView = new MainActivitySurfaceView(this);
        setContentView(mView);
    }

    @Override
    protected void onPause() {
        super.onPause();
        mView.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mView.onResume();
    }
}
