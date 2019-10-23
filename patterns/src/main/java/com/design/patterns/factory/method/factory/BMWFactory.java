package com.design.patterns.factory.method.factory;

import com.design.patterns.factory.simple.product.BMW;
import com.design.patterns.factory.simple.product.Car;

/**
 * @program: myproject
 * @description:
 * @author: xyu
 * @create: 2019-08-07 15:21
 */
public class BMWFactory implements CarFactory {

    @Override
    public Car getCar() {
        return new BMW();
    }
}
