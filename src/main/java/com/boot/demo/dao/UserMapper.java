package com.boot.demo.dao;

import com.boot.demo.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by admin on 2018/12/12.
 */
public interface UserMapper {


    @Select("SELECT * FROM USERS WHERE NAME = #{name}")
    User findByName(@Param("name") String name);

    @Select("SELECT * FROM USERS WHERE id = #{id}")
    User findById(@Param("id") Integer id);


    @Insert("INSERT INTO USERS(NAME, AGE) VALUES(#{name}, #{age})")
    int insert(@Param("name") String name, @Param("age") Integer age);


}
