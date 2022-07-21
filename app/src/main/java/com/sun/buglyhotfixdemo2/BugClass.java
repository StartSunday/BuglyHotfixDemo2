package com.sun.buglyhotfixdemo2;

import android.util.Log;

public class BugClass {
    public static void bugs(){
        String str = "";
        Log.e("TAG", "bugs: "+str );
        throw new RuntimeException("这是一个bug");
    }
}
