package ru.vsu.cs.suvorov_d_a;

public class TreeNode {
    int value;
    TreeNode leftChild;
    TreeNode rightChild;

    public TreeNode(int data, TreeNode left, TreeNode right) {
        this.value = data;
        this.leftChild = left;
        this.rightChild = right;
    }

    public void printNode() {
        System.out.println(" Выбранный узел имеет значение :" + value);
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(final int value) {
        this.value = value;
    }

    public TreeNode getLeftChild() {
        return this.leftChild;
    }

    public void setLeftChild(final TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return this.rightChild;
    }

    public void setRightChild(final TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", leftChild=" + leftChild +
                ", rightChild=" + rightChild +
                '}';
    }
}