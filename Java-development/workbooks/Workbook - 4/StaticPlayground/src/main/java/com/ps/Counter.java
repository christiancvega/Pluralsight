package com.ps;

public class Counter {
    int instanceCount = 0;

    static private int staticCount = 0;

    public void instanceIncrement(){
      instanceCount++;
    }
    public static void staticIncrement(){
        staticCount++;
    }

}
