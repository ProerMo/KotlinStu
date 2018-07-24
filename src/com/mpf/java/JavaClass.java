package com.mpf.java;

import com.mpf.kotlin.BaseFileKt;
import com.mpf.kotlin.KotlinClass;

public class JavaClass {
    public static void main(String[] args) {
        BaseFileKt.fun_default("mmmm", null);
//        KotlinClass.I
//        System.out.println(KotlinClass.class.newInstance().getLongerString("aa", "aaa"));
        System.out.println(KotlinClass.Companion.getLongerStringStatic("aaaaa", "wowwwowowowowo"));
        System.out.println(new KotlinClass().getLongerString("", "1321564330.0.221"));
        System.out.println(KotlinClass.getLongerStringStatic("","fsdfsdfsdfsdfsdfsdfsdf"));
        BaseFileKt.fun_default("aa","ff");
    }

    public static int getBigger(int a, int b) {
        return a > b ? a : b;
    }

    public int getSmaller(int a, int b) {
        return a < b ? a : b;

    }

}
