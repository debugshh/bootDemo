package com.boot.demo.service;

import com.boot.demo.bean.User;
import com.boot.demo.dao.UserMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.security.PrivateKey;

/**
 * Created by admin on 2018/12/12.
 */

public interface UserService {



    public User findUserById(Integer id );

    public void addUser(String name , Integer age );


}
