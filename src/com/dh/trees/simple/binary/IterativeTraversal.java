package com.dh.trees.simple.binary;


import java.util.Stack;

public class IterativeTraversal {

    static void preOrder(Tree t){
        traversePre(t.root);
    }

    /*
        In traversing pre order it will be root, left ,right
     */
    private static void traversePre(Node node){
        if(node == null){
            System.out.println("No nodes in the tree");
        }else {
            // Create an empty stack and push root to it
            Stack<Node> nodeStack = new Stack<>();
            nodeStack.push(node);

            while (!nodeStack.isEmpty()){
                Node currNode = nodeStack.peek();
                System.out.print(currNode.data + " ");
                nodeStack.pop();
                if(currNode.right != null){
                    nodeStack.push(currNode.right);
                }
                if(currNode.left != null){
                    nodeStack.push(currNode.left);
                }

            }
        }
    }
}
