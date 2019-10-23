package com.design.patterns.factory.abstarct.factory;

/**
 * @program: myproject
 * @description:
 * @author: xyu
 * @create: 2019-08-07 15:56
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String type) {
        AbstractFactory factory;
        switch (type) {
            case "animal":
                factory = new AnimalFactory();
                break;
            case "car":
                factory = new CarFactory();
                break;
            default:
                factory = null;
                break;
        }
        return factory;
    }
}
