package com.xyu.algorithm.sort.insertion;

import com.xyu.algorithm.sort.selection.SelectionSort;

import static com.xyu.algorithm.sort.SortTestHelper.*;

/**
 * @program: 插入排序 O(n^2)
 * @description: 从第 1 个元素开始，依次判断此元素与之前元素的大小，如果比前元素小，
 * 就把前元素往后挪一个位置，否则终止循环，把该元素放到最后终止的位置
 * 重要性质：提前终止内层循环，在近乎有序的数组中效率最高
 * @author: xyu
 * @create: 2019-08-15 13:56
 */
public class InsertionSort {

    public static void sort(int[] data) {
        int length = data.length;
        for (int i = 1; i < length; i++) {
            int index;
            int value;
            for (int j = 0; j < i; j++) {
                if (data[i] < data[j]) {
                    index = j;
                    value = data[i];
                    for (int x = i; x > index; x--) {
                        data[x] = data[x - 1];
                    }
                    data[index] = value;
                    break;
                }
            }
        }

        /*for (int i = 1; i < data.length; i++) {
            // 寻找元素 arr[i] 合适的插入位置
            int x = data[i];
            // j 保存元素 x 应该插入的位置
            int j;
            for (j = i; j >= 1 && x < (data[j - 1]); j--) {
                data[j] = data[j - 1];
            }
            data[j] = x;
        }*/
    }

    public static void main(String[] args) {
        int[] data = generateRandomArray(100, 1, 100);
        testSort(InsertionSort.class, data);
        printArray(data);
    }
}
