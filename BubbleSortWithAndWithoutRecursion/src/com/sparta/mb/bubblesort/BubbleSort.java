package com.sparta.mb.bubblesort;

public class BubbleSort {
    private int counter = 0;
    int[] array;
    int[] array2;
    int temp;

    public BubbleSort(int[] array, int[] array2) {
        this.array = array;
        this.array2 = array2;
    }

    public int[] getArray() {
        return array;
    }

    public int[] getArray2() {
        return array2;
    }

    public int[] bubbleSort(int[] array) {
        int temp;
        while (counter < array.length) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
            counter++;
        }
        return array;
    }

    public int[] bubbleSortWithRecursion(int[] array2) {
        for (int i = 0; i < array2.length - 1; i++) {
            if (array2[i] > array2[i + 1]) {
                temp = array2[i];
                array2[i] = array2[i + 1];
                array2[i + 1] = temp;
                bubbleSortWithRecursion(array2);
            }
        }
        return array2;
    }
}
