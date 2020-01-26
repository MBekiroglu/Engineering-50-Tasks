package com.sparta.mb.mergesort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        MergeSort mergeSort = new MergeSort(new int[]{3, 1, 2, 3, 10, 6, 4});

        System.out.println(Arrays.toString(mergeSort.sort(mergeSort.getMerge())));
    }
}
