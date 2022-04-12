package ru.vsu.cs.suvorov_d_a;

public class ComparingTrees {
    public static boolean isSameTree(TreeNode root1,TreeNode root2) {
        if (root1 != null && root2 == null) {
            return false;
        }
        if (root2 == null && root1 != null) {
            return false;
        }
        if (root1 == null && root2 == null) {
            return true;
        }

        if (root1.value != root2.value) {
            return false;
        }
        return  isSameTree(root1.leftChild,root2.leftChild) && isSameTree(root1.rightChild,root2.rightChild);

    }
}
