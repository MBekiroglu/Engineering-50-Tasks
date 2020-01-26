package com.sparta.mb;

public class BinaryTree {
    Node root;


    public BinaryTree(int start) {
        this.root = new Node(start);
    }

    public void addElement(int value, Node node) {
        //check if value = 2
        //check against the node
        if (value > node.getValue()) {
            if (node.getRightChild() != null) {
                addElement(value, node.getRightChild());
            } else {
                node.setRightChild(new Node(value));
            }
        } else if (value < node.getValue()) {
            if (node.getLeftChild() != null) {
                addElement(value, node.getLeftChild());
            } else {
                node.setLeftChild(new Node(value));
            }
        } else {
            node.incrementCounter();
        }
    }

    public void sortAsc(Node node) {
        // check if there is a left child
        if (node != null) {
            sortAsc(node.getLeftChild());
            //System.out.println(" " + node.getValue() + "(" + node.getCounter()+ ")");
            sortAsc(node.getRightChild());
        }
    }
}
