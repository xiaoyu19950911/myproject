package com.design.patterns.factory.abstarct.factory;

import com.design.patterns.factory.simple.product.BMW;
import com.design.patterns.factory.simple.product.Benz;
import com.design.patterns.factory.simple.product.Car;

/**
 * @program: myproject
 * @description:
 * @author: xyu
 * @create: 2019-08-07 15:47
 */
public class CarFactory extends AbstractFactory {

    @Override
    public Car getCar(String type) {
        Car car;
        switch (type) {
            case "benz":
                car = new Benz();
                break;
            case "bmw":
                car = new BMW();
                break;
            default:
                car = null;
                break;
        }
        return car;
    }
}
