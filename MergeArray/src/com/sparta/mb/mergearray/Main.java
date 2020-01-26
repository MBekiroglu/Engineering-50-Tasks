package com.sparta.mb.mergearray;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] array1 = new int[]{1, 2, 4, 5, 5, 8, 9, 12, 18, 99};
        int[] array2 = new int[]{5, 8, 9, 10, 55, 55, 100};

        MergeArray mergeThing = new MergeArray();

        int[] result = mergeThing.arrayMerge(array1, array2);
        System.out.println(Arrays.toString(result));

        //System.out.println(Arrays.toString(mergeThing.arrayMerge(array1, array2)));
    }
}
