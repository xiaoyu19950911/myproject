package com.xyu.algorithm.extra;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: myproject
 * @description: 给你一个装满水的 8 升满壶和两个分别是 5 升、3 升的空壶，请想个优雅的办法，使得其中一个水壶恰好装 4 升水，每一步的操作只能是倒空或倒满
 * @author: xyu
 * @create: 2019-08-30 16:45
 */
public class Water {
    static int amax = 8;
    static int bmax = 5;
    static int cmax = 3;


    public static void main(String[] args) {
        System.out.println(recursive(new Glass(8, 8), new Glass(5, 0), new Glass(3, 0)));
    }

    private static boolean recursive(Glass a, Glass b, Glass c) {
        Queue<Glass> glassQueue = new LinkedList<>();
        Glass a1 = new Glass(a.size, a.number);
        Glass a2 = new Glass(a.size, a.number);
        Glass a3 = new Glass(a.size, a.number);
        Glass b1 = new Glass(b.size, b.number);
        Glass b2 = new Glass(b.size, b.number);
        Glass b3 = new Glass(b.size, b.number);
        Glass c1 = new Glass(c.size, c.number);
        Glass c2 = new Glass(c.size, c.number);
        Glass c3 = new Glass(c.size, c.number);
        Glass a4 = new Glass(a.size, a.number);
        Glass a5 = new Glass(a.size, a.number);
        Glass a6 = new Glass(a.size, a.number);
        Glass b4 = new Glass(b.size, b.number);
        Glass b5 = new Glass(b.size, b.number);
        Glass b6 = new Glass(b.size, b.number);
        Glass c4 = new Glass(c.size, c.number);
        Glass c5 = new Glass(c.size, c.number);
        Glass c6 = new Glass(c.size, c.number);
        Glass a7 = new Glass(a.size, a.number);
        Glass b7 = new Glass(b.size, b.number);
        Glass c7 = new Glass(c.size, c.number);
        Glass a8 = new Glass(a.size, a.number);
        Glass b8 = new Glass(b.size, b.number);
        Glass c8 = new Glass(c.size, c.number);
        if (mix(a1, b1, c1) || mix(b2, a2, c2) || mix(a3, c3, b3) || mix(c4, a4, b4) || mix(b5, a5, c5) || mix(a6, b6, c6) || mix(c7, b7, a7)|| mix(b8, c8, a8)) {
            return recursive(a1,b1,c1);
        } else {
            return false;
        }
    }

    private static boolean mix(Glass a, Glass b, Glass c) {//a向b倒
        if (b.number < b.size) {//b未满
            if (a.number + b.number > b.size) {//a向b加满水
                b.number = b.size;//b中水已满
                a.number = a.number - (b.size - b.number);
            } else {
                a.number = 0;
                b.number = a.number + b.number;
            }
            if (a.number == 4 || b.number == 4 || c.number == 4) {
                System.out.println("a,b,c=" + a + b + c);
                return true;
            } else {
                return false;
            }
        }
        return false;
    }


    static class Glass {
        private int size;
        private int number;

        public Glass(int size, int number) {
            this.size = size;
            this.number = number;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        @Override
        public String toString() {
            return "Glass{" +
                    "size=" + size +
                    ", number=" + number +
                    '}';
        }
    }
}
