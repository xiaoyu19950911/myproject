package com.design.patterns.factory.method;

import com.design.patterns.factory.method.factory.BenzFactory;
import com.design.patterns.factory.method.factory.CarFactory;
import com.design.patterns.factory.simple.product.Car;

/**
 * @program: myproject
 * @description:
 * @author: xyu
 * @create: 2019-08-07 15:18
 */
public class Test {

    public static void main(String[] args) {
        CarFactory factory = new BenzFactory();
        Car car = factory.getCar();
        System.out.println(car.getName());
    }
}
