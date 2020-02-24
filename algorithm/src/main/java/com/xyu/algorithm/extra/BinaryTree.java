package com.xyu.algorithm.extra;

/**
 * @program: myproject
 * @description: 二叉树
 * @author: xyu
 * @create: 2019-11-11 16:50
 */
public class BinaryTree {

    private  int val;

    private  BinaryTree left;

    private  BinaryTree right;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public BinaryTree getLeft() {
        return left;
    }

    public void setLeft(BinaryTree left) {
        this.left = left;
    }

    public BinaryTree getRight() {
        return right;
    }

    public void setRight(BinaryTree right) {
        this.right = right;
    }
}
