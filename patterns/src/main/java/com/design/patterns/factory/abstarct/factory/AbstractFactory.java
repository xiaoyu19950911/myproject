package com.design.patterns.factory.abstarct.factory;

import com.design.patterns.factory.abstarct.product.Animal;
import com.design.patterns.factory.simple.product.Car;

/**
 * @program: myproject
 * @description:
 * @author: xyu
 * @create: 2019-08-07 15:42
 */
public abstract class AbstractFactory {

    public  Car getCar(String type){
        return null;
    }

    public  Animal getAnimal(){
        return null;
    }
}
