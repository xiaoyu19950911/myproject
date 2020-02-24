package com.example.lock;

import java.util.*;

/**
 * @program: myproject
 * @description:
 * @author: xyu
 * @create: 2020-01-07 15:17
 */
public class SolutionTest {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numIndexMap = new HashMap<Integer, Integer>(nums.length, 1.0F);
        String s = "A man, a plan, a canal: Panama";
        s.trim();
        s=s.toLowerCase();
        char[] chars = s.toCharArray();
        for (int i = 0; i < nums.length; i++) {
            // 判断是否有匹配的
            Integer j = numIndexMap.get(target - nums[i]);
            if (j != null) {
                return new int[]{i, j};
            }

            // 添加到 numIndexMap 中
            numIndexMap.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        SolutionTest solution = new SolutionTest();
        System.out.println(Arrays.toString(solution.twoSum(new int[]{2, 7, 11, 15}, 9)));
    }
}
