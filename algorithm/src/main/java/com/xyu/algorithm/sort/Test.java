package com.xyu.algorithm.sort;

/**
 * @program: myproject
 * @description:
 * @author: xyu
 * @create: 2019-12-16 14:39
 */
public class Test {

    public static void sort1(int[] data, int start, int end){
        int left = start;
        int right = end;
        int key = data[left];
        if (left<right){
            while (key<data[right] && left <right) {
                right--;
            }
            data[left]=data[right];
            while (key>data[left] && left<right)
                left++;
            data[right] = data[left];
        }
        data[left] = key  ;
        sort1(data,start,left-1);
        sort1(data,left+1,end);

    }
}
