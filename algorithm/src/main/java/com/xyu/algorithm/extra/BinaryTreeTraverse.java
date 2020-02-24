package com.xyu.algorithm.extra;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: myproject
 * @description: 二叉树的遍历
 * @author: xyu
 * @create: 2019-11-12 10:18
 */
public class BinaryTreeTraverse {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        List<Integer> list = new ArrayList<>();
        leftTraversal(tree, list);
    }

    /**
     * 左中右遍历
     *
     * @param tree
     * @param list
     */
    private static void leftTraversal(BinaryTree tree, List<Integer> list) {
        if (tree == null)
            return;
        leftTraversal(tree.getLeft(), list);
        list.add(tree.getVal());
        leftTraversal(tree.getRight(), list);
    }

    /**
     * 获取二叉树的节点个数
     *
     * @param tree
     * @return
     */
    private static int getNum(BinaryTree tree) {
        if (tree == null)
            return 0;
        return getNum(tree.getLeft()) + getNum(tree.getRight()) + 1;
    }


    /**
     * 获取二叉树的深度
     *
     * @param tree
     * @return
     */
    private static int getDepth(BinaryTree tree) {
        if (tree == null)
            return 0;
        return Math.max(getDepth(tree.getLeft()), getDepth(tree.getRight())) + 1;
    }


    /**
     * 获取第k层的节点的个数
     *
     * @param tree
     * @param k
     * @return
     */
    private static int getNodeNumKth(BinaryTree tree, int k) {
        if (tree == null || k < 1)
            return 0;
        if (k == 1)
            return 1;
        return getNodeNumKth(tree.getLeft(), k - 1) + getNodeNumKth(tree.getRight(), k - 1);
    }

    /**
     * 获取叶子节点个数
     *
     * @param tree
     * @return
     */
    private static int getNodeLeaf(BinaryTree tree) {
        if (tree == null)
            return 0;
        if (tree.getLeft() == null && tree.getRight() == null)
            return 1;
        return getNodeLeaf(tree.getLeft()) + getNodeLeaf(tree.getRight());
    }

    /**
     * 判断两棵树是否相等
     *
     * @param tree1
     * @param tree2
     * @return
     */
    private static boolean isSame(BinaryTree tree1, BinaryTree tree2) {
        if (tree1 == null && tree2 == null)
            return true;
        if (tree1 == null || tree2 == null)
            return false;
        if (tree1.getVal() != tree2.getVal())
            return false;
        return isSame(tree1.getLeft(), tree2.getLeft()) && isSame(tree1.getRight(), tree2.getRight());
    }

    /**
     * 判断一棵树是否为二叉平衡树
     *
     * @param tree
     * @return
     */
    private static boolean isAVL(BinaryTree tree) {
        if (tree == null)
            return true;
        if (Math.abs(getDepth(tree.getLeft()) - getDepth(tree.getRight())) > 1)
            return false;
        return isAVL(tree.getLeft()) && isAVL(tree.getRight());
    }

    /**
     * 获取二叉树的镜像二叉树
     *
     * @param tree
     * @return
     */
    private static BinaryTree getMirro(BinaryTree tree) {
        if (tree == null)
            return null;
        BinaryTree left = getMirro(tree.getRight());
        BinaryTree right = getMirro(tree.getLeft());
        tree.setLeft(left);
        tree.setRight(right);
        return tree;
    }

    /**
     * 判断二叉树是否为二叉搜索树
     * @param tree
     * @return
     */
    private static boolean isBST(BinaryTree tree) {
        return isBST(tree, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean isBST(BinaryTree tree, int minValue, int maxValue) {
        if (tree == null)
            return true;
        if (tree.getVal() < minValue || tree.getVal() > maxValue)
            return false;
        return isBST(tree.getLeft(), minValue, tree.getVal()) && isBST(tree.getRight(), tree.getVal(), maxValue);
    }
}
