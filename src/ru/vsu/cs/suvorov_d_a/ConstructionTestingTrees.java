package ru.vsu.cs.suvorov_d_a;

public class ConstructionTestingTrees {
    public static TreeNode buildTreeOneForTest1() {
        TreeNode node1 = new TreeNode(0, null, null);
        TreeNode node2 = new TreeNode(1, null, null);
        TreeNode node3 = new TreeNode(5, null, null);
        TreeNode node4 = new TreeNode(7, null, null);
        node1.leftChild = node2;
        node1.rightChild = node3;
        node2.leftChild = node4;
        return node1;
    }

    public static TreeNode buildTreeTwoForTest1() {
        TreeNode node1 = new TreeNode(0, null, null);
        TreeNode node2 = new TreeNode(1, null, null);
        TreeNode node3 = new TreeNode(5, null, null);
        TreeNode node4 = new TreeNode(7, null, null);
        node1.leftChild = node2;
        node1.rightChild = node3;
        node2.leftChild = node4;
        return node1;
    }

    public static TreeNode buildTreeOneForTest2() {
        TreeNode node1 = new TreeNode(8, null, null);
        TreeNode node2 = new TreeNode(2, null, null);
        TreeNode node3 = new TreeNode(3, null, null);
        TreeNode node4 = new TreeNode(4, null, null);
        node1.leftChild = node2;
        node1.rightChild = node3;
        node2.leftChild = node4;
        return node1;
    }

    public static TreeNode buildTreeTwoForTest2() {
        TreeNode node1 = new TreeNode(1, null, null);
        TreeNode node2 = new TreeNode(2, null, null);
        TreeNode node3 = new TreeNode(3, null, null);
        TreeNode node4 = new TreeNode(4, null, null);
        node1.leftChild = node2;
        node1.rightChild = node3;
        node2.leftChild = node4;
        return node1;
    }

    public static TreeNode buildTreeOneForTest3() {
        TreeNode node1 = new TreeNode(2, null, null);
        TreeNode node2 = new TreeNode(3, null, null);
        TreeNode node3 = new TreeNode(4, null, null);
        TreeNode node4 = new TreeNode(5, null, null);
        node1.leftChild = node4;
        node3.rightChild = node2;
        node2.leftChild = node4;
        return node1;
    }

    public static TreeNode buildTreeTwoForTest3() {
        TreeNode node1 = new TreeNode(2, null, null);
        TreeNode node2 = new TreeNode(3, null, null);
        TreeNode node3 = new TreeNode(4, null, null);
        TreeNode node4 = new TreeNode(5, null, null);
        node1.leftChild = node4;
        node3.rightChild = node2;
        node2.leftChild = node4;
        return node1;
    }
}
