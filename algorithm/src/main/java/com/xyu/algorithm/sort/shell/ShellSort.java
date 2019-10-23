package com.xyu.algorithm.sort.shell;

import com.xyu.algorithm.sort.selection.SelectionSort;

import java.util.HashMap;

import static com.xyu.algorithm.sort.SortTestHelper.*;

/**
 * @program: 希尔排序 —— 插入排序的延伸，不稳定，最差 O(n^2)
 * @description: 将插入排序中的步长 1 换成一个增量序列
 * @author: xyu
 * @create: 2019-08-15 14:24
 */
public class ShellSort {

    public static void sort(int[] data) {

        // 计算增量序列: 1, 4, 13, 40, 121, 364, 1093...
        int h = 1;
        while (h < data.length / 3) {
            h = 3 * h + 1;
        }
        while (h >= 1) {
            for (int i = h; i < data.length; i++) {
                int x = data[i];
                int j;
                for (j = i; j >= h && x < (data[j - h]); j = j - h) {
                    data[j] = data[j - h];
                }
                data[j] = x;
            }
            h /= 3;
        }
    }

    public static void main(String[] args) {
        int[] data = generateRandomArray(100, 1, 100);
        testSort(SelectionSort.class, data);
        printArray(data);
    }

}
