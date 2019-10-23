package com.xyu;

import com.xyu.dao.UserDao;
import com.xyu.dao.impl.UserDaoImpl;
import com.xyu.model.User;
import org.apache.ibatis.binding.MapperRegistry;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        UserDao userDao = context.getBean(UserDao.class);
        User user = userDao.getUser(1);
        System.out.println(user);
    }
}
