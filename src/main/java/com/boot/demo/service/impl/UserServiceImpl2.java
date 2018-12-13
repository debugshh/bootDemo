package com.boot.demo.service.impl;

import com.boot.demo.bean.User;
import com.boot.demo.dao2.UserMapper2;
import com.boot.demo.service.UserService2;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by admin on 2018/12/12.
 */
@Service
//@Transactional(transactionManager = "test2TransactionManager")
public class UserServiceImpl2 implements UserService2 {

    @Resource
    private UserMapper2 userMapper2 ;


    @Override
    public User findUserById(Integer id) {
        return userMapper2.findById(id);
    }

    @Override
    public void addUser(String name, Integer age) {
        userMapper2.insert(name , age ) ;
    }
}
