package com.boot.demo.dao2;

import com.boot.demo.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by admin on 2018/12/12.
 */
public interface UserMapper2 {

    @Select("SELECT * FROM USER WHERE NAME = #{name}")
    User findByName(@Param("name") String name);

    @Select("SELECT * FROM USER WHERE id = #{id}")
    User findById(@Param("id") Integer id);


    @Insert("INSERT INTO USER(NAME, AGE) VALUES(#{name}, #{age})")
    int insert(@Param("name") String name, @Param("age") Integer age);

}
