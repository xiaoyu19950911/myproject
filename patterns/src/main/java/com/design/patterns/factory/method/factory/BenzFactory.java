package com.design.patterns.factory.method.factory;

import com.design.patterns.factory.simple.product.Benz;
import com.design.patterns.factory.simple.product.Car;

/**
 * @program: myproject
 * @description:
 * @author: xyu
 * @create: 2019-08-07 15:21
 */
public class BenzFactory implements CarFactory {

    @Override
    public Car getCar() {
        return new Benz();
    }
}
