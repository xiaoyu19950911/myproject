package com.xyu.dao;

import com.xyu.model.User;

public interface UserDao {

    User getUser(Integer id);

    User insertUser(User user);
}
