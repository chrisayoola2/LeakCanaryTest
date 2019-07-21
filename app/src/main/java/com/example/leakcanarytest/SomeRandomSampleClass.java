package com.example.leakcanarytest;

import android.content.Context;

public class SomeRandomSampleClass {
    private static SomeRandomSampleClass someRandomSampleClassInstance;

    private Context context;

    private SomeRandomSampleClass(Context context){
        this.context = context;
    }

    public static SomeRandomSampleClass getSomeRandomSampleClassInstance (Context context){
        if(someRandomSampleClassInstance == null ){
            someRandomSampleClassInstance = new SomeRandomSampleClass(context);
        }
        return someRandomSampleClassInstance;
    }
}
