package com.xyu.dao.impl;

import com.xyu.dao.UserDao;
import com.xyu.model.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

    public User findUserById(Integer id) {
        SqlSession sqlSession=getSqlSession();
        User user=sqlSession.selectOne("com.xyu.mapper.userMapper.getUser",id);
        return user;
    }

    public User getUser(Integer id) {
        return null;
    }

    public User insertUser(User user) {
        SqlSession session = getSqlSession();
        session.insert("com.xyu.mapper.userMapper.insertUser", user);
        session.commit();
        return user;
    }
}
