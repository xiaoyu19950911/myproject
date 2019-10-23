package com.xyu.algorithm.extra;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @program: myproject
 * @description:
 * @author: xyu
 * @create: 2019-08-27 17:01
 */
public class ThreeDoorProblem {

    public static void main(String[] args) {
        Random random = new Random();
        int b = 0;//不换门赢的概率
        int h = 0;//换门赢的概率
        for (int i = 0; i < 100000; i++) {
                List<Integer> list = new ArrayList<>();//三扇门编号
                list.add(0);
                list.add(1);
                list.add(2);
                int a = random.nextInt(3);//0,1,2三扇门中有车的那扇门
                int s = random.nextInt(3);//参赛者随机选择一扇门
                list.remove(s);
                int z = list.get(random.nextInt(2));//主持人开的剩下两扇门其中的一扇
                if (z!=a){
                    if (s==a){//若不换门
                        b++;
                    }else {
                        h++;
                    }
                }
        }
        System.out.println("不换门赢的次数：" + b + ",不换门赢的概率：" + (float)b / (b + h));
        System.out.println("换门赢的次数：" + h + ",换门赢的概率：" + (float)h / (b + h));
    }
}
