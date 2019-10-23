package com.xyu.algorithm.sort.selection;

import com.xyu.algorithm.sort.bubble.BubbleSort;

import static com.xyu.algorithm.sort.SortTestHelper.*;

/**
 * @program: 选择排序 O(n^2)
 * @description: i 从 0 开始递增，以第 i 个元素为最小，从 i+1 开始找出比该值更小的元素，与之交换位置。重要性质：交换次数最少 O(n)
 * @author: xyu
 * @create: 2019-08-15 13:46
 */
public class SelectionSort {

    public static void sort(int[] data) {
        int length = data.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (data[i] > data[j]) {
                    swap(data, i, j);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] data = generateRandomArray(100, 1, 100);
        testSort(SelectionSort.class, data);
        printArray(data);
    }
}
