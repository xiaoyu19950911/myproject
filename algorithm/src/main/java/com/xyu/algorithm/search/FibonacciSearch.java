package com.xyu.algorithm.search;

import com.xyu.algorithm.sort.bubble.BubbleSort;

import java.util.Arrays;

import static com.xyu.algorithm.sort.SortTestHelper.generateRandomArray;
import static com.xyu.algorithm.sort.SortTestHelper.printArray;
import static com.xyu.algorithm.sort.SortTestHelper.testSort;

/**
 * @program: 时间复杂度O(log(n))
 * @description: 斐波那契搜索
 * @author: xyu
 * @create: 2019-08-15 16:20
 */
public class FibonacciSearch {

    public static int[] createFibonacci(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            if (i <= 1) {
                array[i] = 1;
            } else {
                array[i] = array[i - 1] + array[i - 2];
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] fibonacciArray = createFibonacci(20);
        int[] data = generateRandomArray(100, 1, 100);
        testSort(BubbleSort.class, data);
        printArray(data);
        System.out.println(findElement(data, fibonacciArray, 10));
    }

    private static int findElement(int[] data, int fibonacciArray[], int search) {
        int length = data.length;
        int index = 0;
        while (fibonacciArray[index] < length) {
            index++;
        }
        int fibonacci = fibonacciArray[index];
        int[] temp = Arrays.copyOf(data, fibonacci);
        int middle = fibonacciArray[index - 1];
        if (search < middle) {
            int newTemp[] = new int[middle];
            System.arraycopy(temp, 0, newTemp, 0, middle);
            return recurse(newTemp, search,  fibonacciArray, index-1);
        } else if (search > middle) {
            int newTemp[] = new int[temp.length-middle];
            System.arraycopy(temp, middle, newTemp, 0, temp.length - middle);
            return recurse(newTemp, search,fibonacciArray,index-1);
        } else
            return middle;
    }

    private static int recurse(int[] temp, int search,int[] fibonacciArray, int index) {
        int middle = fibonacciArray[index-1];
        if (search < middle) {
            int newTemp[] = new int[middle];
            System.arraycopy(temp, 0, newTemp, 0, middle);
            return recurse(newTemp, search, fibonacciArray, index-1);
        } else if (search > middle) {
            int newTemp[] = new int[temp.length-middle];
            System.arraycopy(temp, middle, newTemp, 0, temp.length - middle);
            return recurse(newTemp, search, fibonacciArray,index-1);
        } else
            return middle;
    }
}
