package com.sparta.mb.arraysort;

public class Bubble<T extends Comparable <T>> {
    T[] array;

    public Bubble(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return this.array;
    }

    public <T extends Comparable <T>> T[] arraySort(T[] array) {
        T temp;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].compareTo(array[i + 1]) > 0) {
                temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                arraySort(array);
            }
        }
        return array;
    }
}
