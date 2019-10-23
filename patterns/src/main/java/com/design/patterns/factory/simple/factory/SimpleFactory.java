package com.design.patterns.factory.simple.factory;

import com.design.patterns.factory.simple.product.BMW;
import com.design.patterns.factory.simple.product.Benz;
import com.design.patterns.factory.simple.product.Car;

/**
 * @program: myproject
 * @description:
 * @author: xyu
 * @create: 2019-08-07 15:11
 */
public class SimpleFactory {

    public Car getCar(String model) {
        Car car;
        switch (model) {
            case "BMW":
                car = new BMW();
                break;
            case "Benz":
                car = new Benz();
                break;
            default:
                car = null;
                break;
        }
        return car;
    }
}
