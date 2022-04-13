package ru.vsu.cs.suvorov_d_a;

import org.junit.Assert;
import org.junit.Test;

public class TestOfEqualsTrees {
    TreeNode treeNodeOneForTestOne = ConstructionTestingTrees.buildTreeOneForTest1();
    TreeNode treeNodeTwoForTestOne = ConstructionTestingTrees.buildTreeTwoForTest1();
    TreeNode treeNodeOneForTestTwo = ConstructionTestingTrees.buildTreeOneForTest2();
    TreeNode treeNodeTwoForTestTwo = ConstructionTestingTrees.buildTreeTwoForTest2();
    TreeNode treeNodeOneForTestThree = ConstructionTestingTrees.buildTreeOneForTest3();
    TreeNode treeNodeTwoForTestThree = ConstructionTestingTrees.buildTreeTwoForTest3();

    @Test
    public void testA() {
        boolean result = ComparingTrees.isSameTree(treeNodeOneForTestOne, treeNodeTwoForTestOne);
        Assert.assertTrue(result);
    }

    @Test
    public void testB() {
        boolean result = ComparingTrees.isSameTree(treeNodeOneForTestTwo, treeNodeTwoForTestTwo);
        boolean trueResult = !result; //заведомо падающий тест, так как деревья не равны, но сама программа отрабатывает корректно;
        Assert.assertTrue(trueResult);
    }

    @Test
    public void testC() {
        boolean result = ComparingTrees.isSameTree(treeNodeOneForTestThree, treeNodeTwoForTestThree);
        Assert.assertTrue(result);
    }
}
