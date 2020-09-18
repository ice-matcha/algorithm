package com.algorithm;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {
    public static void main(String[] args)
    {
        Integer[] arr = {3,5,4,6,9,1,2};

        /*
        //测试冒泡
        Bubble bu = new Bubble();
        bu.sort(arr);
         */

        /*
        //测试选择
        Selection se = new Selection();
        se.sort(arr);
         */

        /*
        //测试插入
        Insertion in = new Insertion();
        in.sort(arr);
         */

        //测试希尔
        Shell sh = new Shell();
        sh.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
