package ru.vsu.cs.suvorov_d_a;

public class ConstructionMyBinaryTrees {
    public static TreeNode buildTree1() {
        TreeNode node1 = new TreeNode(1, null, null);
        TreeNode node2 = new TreeNode(2, null, null);
        TreeNode node3 = new TreeNode(3, null, null);
        TreeNode node4 = new TreeNode(4, null, null);
        node1.leftChild = node2;
        node1.rightChild = node3;
        node2.leftChild = node4;
        return node1;
    }

    public static TreeNode buildTree2() {
        TreeNode node1 = new TreeNode(1, null, null);
        TreeNode node2 = new TreeNode(2, null, null);
        TreeNode node3 = new TreeNode(3, null, null);
        TreeNode node4 = new TreeNode(4, null, null);
        node1.leftChild = node2;
        node1.rightChild = node3;
        node2.leftChild = node4;
        return node1;
    }
}
