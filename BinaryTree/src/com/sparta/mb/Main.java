package com.sparta.mb;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] array = {3, 2, 5, 7, 2};
        BinaryTree binaryTree = new BinaryTree(array[0]);

        for (int i = 1; i < array.length; i++) {
            binaryTree.addElement(array[i], binaryTree.root);
        }
        double start = System.nanoTime();
        binaryTree.sortAsc(binaryTree.root);
        double total = System.nanoTime() - start;
        System.out.println(total / 1000000 + "\n");
    }
}
