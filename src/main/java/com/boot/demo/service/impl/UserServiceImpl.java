package com.boot.demo.service.impl;

import com.boot.demo.bean.User;
import com.boot.demo.dao.UserMapper;
import com.boot.demo.dao2.UserMapper2;
import com.boot.demo.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by admin on 2018/12/12.
 */

@Service
//@Transactional(transactionManager = "test1TransactionManager")
public class UserServiceImpl implements UserService {


    @Resource
    private UserMapper userMapper;
    @Resource
    private UserMapper2 userMapper2;


    @Override
    public User findUserById(Integer id) {


        return userMapper.findById(id);
    }

    @Override
    @Transactional
    public void addUser(String name, Integer age) {

        userMapper.insert(name , age ) ;

        userMapper2.insert(name , age );
        int i = 1/ 0 ;


    }


}
