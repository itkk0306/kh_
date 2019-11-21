package com.example.jnitest;

public class HelloNDK {
    static {
        System.loadLibrary("native-lib");
    }

    public native String stringFromJNI();

    /* C 언어를 호출하는 , 자바와 연동할 수 있는 헤더 파일을 만들어 주세요. */
}
