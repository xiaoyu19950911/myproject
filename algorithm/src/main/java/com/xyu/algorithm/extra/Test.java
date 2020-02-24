package com.xyu.algorithm.extra;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: myproject
 * @description:
 * @author: xyu
 * @create: 2019-11-16 12:55
 */
public class Test {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        List<Integer> list = new ArrayList<>();
        isBST(tree);
    }

    private static boolean isBST(BinaryTree tree) {
        return isBST(tree, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean isBST(BinaryTree tree, int min, int max) {
        if (tree == null)
            return true;
        if (tree.getLeft().getVal() < min || tree.getRight().getVal() > max)
            return false;
        return isBST(tree.getLeft(), min,tree.getVal())&&isBST(tree.getRight(),tree.getVal(),max);
    }


}
