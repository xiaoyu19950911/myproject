package com.design.patterns.factory.simple;

import com.design.patterns.factory.simple.factory.SimpleFactory;
import com.design.patterns.factory.simple.product.Car;

/**
 * @program: myproject
 * @description:
 * @author: xyu
 * @create: 2019-08-07 15:15
 */
public class Test {

    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        Car car = factory.getCar("BMW");
        System.out.println(car.getName());
    }
}
