package com.design.patterns.factory.abstarct.product;

/**
 * @program: myproject
 * @description:
 * @author: xyu
 * @create: 2019-08-07 15:45
 */
public abstract class Animal {

    private String color;

    private String name;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
