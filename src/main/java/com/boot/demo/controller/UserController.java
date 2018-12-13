package com.boot.demo.controller;

import com.boot.demo.dao.UserMapper;
import com.boot.demo.service.UserService;
import com.boot.demo.service.UserService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by admin on 2018/12/12.
 */
@RestController
public class UserController {

    @Autowired
   private UserService userService ;

    @Autowired
    private UserService2 userService2 ;

    @RequestMapping("/addUser")
    public Map<String , String > insertUser(String name , Integer age ){

        userService.addUser(name , age );

        HashMap<String, String> map = new HashMap<>();
        map.put("code " , "200 ");
        map.put("msg" , "成功 ") ;

        return map ;
    }
    @RequestMapping("/addUser2")
    public Map<String , String > insertUser2(String name , Integer age ){
        userService2.addUser(name , age );


        HashMap<String , String> map = new HashMap<String , String>();
        map.put("code " , "200 ");
        map.put("msg" , "成功 ") ;

        return map ;
    }

    @RequestMapping("/getUser")
    public String getUser(Integer id){


        return userService.findUserById(id).toString();

    }

    @RequestMapping("/getUser2")
    public String getUser2(Integer id){


        return userService2.findUserById(id).toString();

    }



}
