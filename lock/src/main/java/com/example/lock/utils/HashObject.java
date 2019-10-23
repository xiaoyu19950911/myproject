package com.example.lock.utils;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Objects;
import java.util.Random;

/**
 * @program: myproject
 * @description: aa
 * @author: xyu
 * @create: 2019-07-04 16:19
 */
public class HashObject {

    public static void main(String[] args) {
        ScriptEngine se = new ScriptEngineManager().getEngineByName("JavaScript");
        String str = "4 4 6 6 60";
        int k = 0;//括号数量
        int length = 9;
        while (true){
            length += k*2;
            break;
        }
        try {
            System.out.println(se.eval(str));
        } catch (ScriptException e) {
            e.printStackTrace();
        }
    }

    public void test() throws InterruptedException {
        int i =0;
        synchronized (HashObject.class){
            System.out.println("test-"+Thread.currentThread().getName());
            Thread.sleep(1000);
        }
    }

    public void test2() throws InterruptedException {
        int i =0;
        synchronized (this){
            System.out.println("test2-"+Thread.currentThread().getName());
            Thread.sleep(1000);
        }
    }
}
