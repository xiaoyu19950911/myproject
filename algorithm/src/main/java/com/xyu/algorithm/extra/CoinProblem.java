package com.xyu.algorithm.extra;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @program: myproject
 * @description: 甲乙二人玩掷硬币的游戏。两人连续抛掷硬币，如果最近三次硬币抛掷结果是“正反反”，则甲胜；如果是“反反正”，则乙胜。问：谁胜的概率更高？
 * @author: xyu
 * @create: 2019-08-27 16:56
 */
public class CoinProblem {

    public static void main(String[] args) {
        int jia = 0, yi = 0;
        Random r = new Random();
        for (int i = 0; i < 100000; i++) {
            List<Integer> list = new ArrayList<>();
            while (true) {
                int a = r.nextInt(2);
                list.add(a);
                if (list.size() >= 3) {
                    if (list.get(list.size() - 1) == 0 && list.get(list.size() - 2) == 0 && list.get(list.size() - 3) == 1) {
                        jia++;
                        break;
                    } else if (list.get(list.size() - 1) == 1 && list.get(list.size() - 2) == 0 && list.get(list.size() - 3) == 0) {
                        yi++;
                        break;
                    }
                }
            }

        }
        System.out.println("甲获胜次数：" + jia + ",甲获胜概率：" + (float)jia / (jia + yi));
        System.out.println("乙获胜次数：" + yi + ",甲获胜概率：" + (float)yi / (jia + yi));

    }
}
