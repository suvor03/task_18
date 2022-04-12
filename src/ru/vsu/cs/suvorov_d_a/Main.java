package ru.vsu.cs.suvorov_d_a;

public class Main {

    public static void main(String[] args) {
        TreeNode treeNode1 = ConstructionMyBinaryTrees.buildTree1();
        TreeNode treeNode2 = ConstructionMyBinaryTrees.buildTree2();
        boolean sameTree = ComparingTrees.isSameTree(treeNode1, treeNode2);

        if(sameTree == true) {
            System.out.println("Деревья равны");
        } else {
            System.out.println("Деревья не равны");
        }

        testingExample();//пример отрисовки дерева без использования скобочного представления
    }

    private static void testingExample() {
        MySimpleBinaryTree tree = new MySimpleBinaryTree();

        tree.insertNode(6);
        tree.insertNode(8);
        tree.insertNode(5);
        tree.insertNode(8);
        tree.insertNode(2);
        tree.insertNode(9);
        tree.insertNode(7);
        tree.insertNode(4);
        tree.insertNode(10);
        tree.insertNode(3);
        tree.insertNode(1);

        tree.printTree();
    }
}
