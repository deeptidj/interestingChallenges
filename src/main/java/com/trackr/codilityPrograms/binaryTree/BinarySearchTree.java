package com.trackr.codilityPrograms.binaryTree;

/**
 * Created by deepti on 3/21/18.
 */
public class BinarySearchTree {

    private static TreeNode root;

    public static void create123() {
        root = new TreeNode(12);
        TreeNode n = new TreeNode(20);
        TreeNode n1 = new TreeNode(10);
        TreeNode n2 = new TreeNode(15);
        root.insert(n);
        root.insert(n1);
        root.insert(n2);
        System.out.println(root.getData());
        System.out.println(root.getRightChild().getData());
        System.out.println(root.getLeftchild().getData());

    }

    public static void main(String[] args) {
        create123();
        findTree(15);
      //  if (root != null) root.inOrderTrversal();
    }
    public static void findTree(int d) {

        int res = root.findTree(d).getData();
        System.out.println("Finding ...");
        System.out.println(res);
    }

}
