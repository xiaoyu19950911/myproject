package com.xyu.algorithm.search;

import com.xyu.algorithm.sort.bubble.BubbleSort;

import static com.xyu.algorithm.sort.SortTestHelper.generateRandomArray;
import static com.xyu.algorithm.sort.SortTestHelper.printArray;
import static com.xyu.algorithm.sort.SortTestHelper.testSort;

/**
 * @program: myproject
 * @description: 二分查找
 * @author: xyu
 * @create: 2019-08-15 14:28
 */
public class BinarySearch {


    public static void main(String[] args) {
        int[] data = generateRandomArray(100, 1, 100);
        testSort(BubbleSort.class, data);
        printArray(data);
        System.out.println(findElement(data, 10, 0, data.length));
    }

    private static int findElement(int[] data, int i, int start, int end) {
        int middleIndex = (start + end) / 2;
        //System.out.println(middleIndex);
        int middle = data[middleIndex];
        if (start + 1 == end && end != i)
            return -1;
        if (i > middle)
            return findElement(data, i, middleIndex, end);
        else if (i < middle)
            return findElement(data, i, 0, middleIndex);
        else
            return middleIndex;
    }
}
