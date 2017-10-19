package com.bdxh.testtools;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bdxh.utils.klog.KLog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        KLog.file("MainActivity", Environment.getExternalStorageDirectory(), "/bdxh/Normal.txt","123");
    }
}
