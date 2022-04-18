package com.trackr.codilityPrograms.binaryTree;

/**
 * Created by deepti on 3/21/18.
 */
public class TreeNode {
    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public int getData() {

        return data;
    }

    public TreeNode(int data) {
        this.data = data;
    }

    public TreeNode getRightChild() {

        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public void insert(TreeNode n) {
        if (n.data <= this.data) {
            if (this.leftChild == null) {
                this.setLeftChild(n);
            }
            else {
                this.leftChild.insert(n);
            }
        } else {
            if (this.rightChild == null) {
                this.setRightChild(n);
            } else {
                this.rightChild.insert(n);
            }

        }
    }

    public TreeNode findTree(int data) {
        if (this.data == data) {
            return this;
        } else {
            if (data < this.data && this.leftChild != null) {
                return leftChild.findTree(data);
            } else {
                if (this.rightChild != null)
                    return rightChild.findTree(data);
            }
        }
        return null;
    }

    public void inOrderTraversal() {
        if (this.leftChild != null)
            this.leftChild.inOrderTraversal();
        System.out.println(" "+this.data);
        if (this.rightChild != null)
            this.rightChild.inOrderTraversal();
    }
}
