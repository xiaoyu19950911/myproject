package com.xiaoyu.common.entity;

import java.io.Serializable;

/**
 * @program: myproject
 * @description:
 * @author: xyu
 * @create: 2019-05-07 17:28
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1374736929089791086L;

    private Integer id;

    private String name;

    private Integer age;

    public User(){
        id=1;
        name="吕布";
        age=21;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
