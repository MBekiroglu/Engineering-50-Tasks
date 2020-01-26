package com.sparta.mb.arraysort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Integer[] a = {3, 8, 6, 7, 4, 8};
        Bubble bubble = new Bubble(a);
        System.out.println(Arrays.toString(bubble.arraySort((bubble.getArray())))) ;
    }
}
