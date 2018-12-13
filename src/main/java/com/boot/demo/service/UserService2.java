package com.boot.demo.service;

import com.boot.demo.bean.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by admin on 2018/12/12.
 */

public interface UserService2 {



    public User findUserById(Integer id );

    public void addUser(String name , Integer age );

}