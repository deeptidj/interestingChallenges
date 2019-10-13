package com.trackr.codilityPrograms.binaryTree;

/**
 * Created by deepti on 3/21/18.
 */
public class TreeNode {
    private int data;
    private TreeNode leftchild;
    private TreeNode rightChild;

    public TreeNode getLeftchild() {
        return leftchild;
    }

    public void setLeftchild(TreeNode leftchild) {
        this.leftchild = leftchild;
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
            if (this.leftchild == null) {
                this.setLeftchild(n);
            }
            else {
                this.leftchild.insert(n);
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
            if (data < this.data && this.leftchild != null) {
                return leftchild.findTree(data);
            } else {
                if (this.rightChild != null)
                    return rightChild.findTree(data);
            }
        }
        return null;
    }

    public void inOrderTrversal() {
        if (this.leftchild != null)
            this.leftchild.inOrderTrversal();
        System.out.println(" "+this.data);
        if (this.rightChild != null)
            this.rightChild.inOrderTrversal();
    }
}
