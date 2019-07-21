package com.example.leakcanarytest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
SomeRandomSampleClass someRandomSampleClass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        someRandomSampleClass = someRandomSampleClass.getSomeRandomSampleClassInstance(this);
    }
}
