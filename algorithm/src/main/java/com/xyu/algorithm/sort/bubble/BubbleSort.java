package com.xyu.algorithm.sort.bubble;

import static com.xyu.algorithm.sort.SortTestHelper.*;

/**
 * @program: 冒泡排序 O(n^2)
 * @description: 循环 n 趟，每一趟依次比较每个元素与下一个元素的大小，把最大的元素“沉”到最后
 * @author: xyu
 * @create: 2019-08-15 11:23
 */
public class BubbleSort {

    public static void sort(int[] data) {
        int length = data.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length -1 - i; j++) {
                if (data[j] > data[j + 1]) {
                    swap(data, j, j + 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] data = generateRandomArray(10000, 1, 10000);
        testSort(BubbleSort.class, data);
        //printArray(data);
    }
}
