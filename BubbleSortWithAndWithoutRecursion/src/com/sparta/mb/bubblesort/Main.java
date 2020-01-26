package com.sparta.mb.bubblesort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BubbleSort arraySort = new BubbleSort(new int[]{3,1,2,8,6,1,2,4,1,2,3,4}, new int[]{3,1,2,8,6,1,2,4,1,2,3,4});
        System.out.println(Arrays.toString(arraySort.bubbleSort(arraySort.getArray())));
        System.out.println(Arrays.toString(arraySort.bubbleSortWithRecursion(arraySort.getArray2())));
    }
}
