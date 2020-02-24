package com.xyu.algorithm.sort.quick;

import com.xyu.algorithm.sort.insertion.InsertionSort;

import java.util.BitSet;

import static com.xyu.algorithm.sort.SortTestHelper.generateRandomArray;
import static com.xyu.algorithm.sort.SortTestHelper.printArray;
import static com.xyu.algorithm.sort.SortTestHelper.testSort;

/**
 * @program: 快速排序 O(nlogn)
 * @description:
 * @author: xyu
 * @create: 2019-09-19 14:00
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] data = generateRandomArray(100, 1, 100);
        testSort(QuickSort.class, data);
        printArray(data);
    }

    public static void sort(int[] data) {

        sort(data, 0, data.length - 1);
    }

    public static void sort(int[] data, int left, int right) {
        if (left >= right)
            return;
        int key = data[left];
        int start = left;
        int end = right;
        while (left < right) {
            while (key <= data[right] && right > left) {
                right--;
            }
            data[left] = data[right];
            while (key >= data[left] && right > left) {
                left++;
            }
            data[right] = data[left];
        }
        data[left] = key;
        sort(data, start, left - 1);
        sort(data, left + 1, end);
    }






}
