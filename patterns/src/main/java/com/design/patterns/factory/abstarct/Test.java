package com.design.patterns.factory.abstarct;

import com.design.patterns.factory.abstarct.factory.AbstractFactory;
import com.design.patterns.factory.abstarct.factory.FactoryProducer;
import com.design.patterns.factory.simple.product.Car;

/**
 * @program: myproject
 * @description:
 * @author: xyu
 * @create: 2019-08-07 15:59
 */
public class Test {

    public static void main(String[] args) {
        AbstractFactory factory = FactoryProducer.getFactory("car");
        Car benz = factory.getCar("Benz");
    }
}
