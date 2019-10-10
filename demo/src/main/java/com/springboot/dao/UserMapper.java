package com.springboot.dao;


import com.springboot.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    //通过注解的方式
    @Select("select userName from test where id = 3")
    String find();

    @Insert("insert into test(id,userName) values(#{id},#{userName})")
    Integer addUser(User user);




//    //通过 xml 配置文件的方式
//    String find();
//
//    Integer addUser(User user);










}
