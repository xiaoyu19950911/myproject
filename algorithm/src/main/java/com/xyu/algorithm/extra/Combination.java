package com.xyu.algorithm.extra;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: myproject
 * @description:
 * @author: xyu
 * @create: 2019-09-27 16:58
 */
public class Combination {

    public static void main(String[] args) {


        List<String> total = new ArrayList<>();
        total.add("A");
        total.add("B");
        total.add("C");
        total.add("D");

        List<List<String>> outputList = new ArrayList<>();
        for (String t :total){
            List<String> c1 = new ArrayList<>();
            c1.add(t);
            System.out.println(c1);
            outputList.add(c1);//第一层


            List<String> cList = new ArrayList<>(total);
            cList.remove(t);
            for (String t2 : cList){
                //List<String> c2 = new ArrayList<>(c1);
                c1.add(t2);
                System.out.println(c1);
                outputList.add(c1);//第二层

                List<String> c3List = new ArrayList<>(total);
                c3List.remove(t);
                c3List.remove(t2);

                for (String t3 : c3List){
                    //List<String> c3 = new ArrayList<>(c2);
                    c1.add(t3);
                    System.out.println(c1);
                    outputList.add(c1);//第二层

                    List<String> c4List = new ArrayList<>(total);
                    c4List.remove(t);
                    c4List.remove(t2);
                    c4List.remove(t3);

                    for (String t4 : c4List){
                        //List<String> c4 = new ArrayList<>(c3);
                        c1.add(t4);
                        System.out.println(c1);
                        outputList.add(c1);//第二层
                    }
                }
            }
        }

        System.out.println(outputList);
    }
}
