package com.dh.trees.simple.binary;


public class TestTree {
    public static void main(String args[]) {
        createTree();
    }

    static void createTree() {
        Tree t = new Tree();
        int arr[] = { 0, 1, 2, 12, 22, 13, 23, 14, 24};
        for (int data : arr) {
            t.insert(data);
        }
        TreePrinter.print(t.root);
        IterativeTraversal.preOrder(t);

    }
}
