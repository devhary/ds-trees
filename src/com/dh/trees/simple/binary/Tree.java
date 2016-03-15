package com.dh.trees.simple.binary;

public class Tree {

    Node root;

    Tree(){

    }

    void insert(int data){
        insert(root, data);
    }

    private Node insert(Node node, int data){
        if(root == null){
            root = new Node(data);
        }else if(node == null) {
            node = new Node(data);
        } else {
            if(node.left == null) {
                node.left = insert(node.left, data);
            } else {
                node.right = insert(node.right, data);
            }
        }
      return node;
    }



}
