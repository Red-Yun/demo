package com.springboot.service;

import com.springboot.dao.UserMapper;
import com.springboot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    private UserMapper userMapper;   //这里报红不影响访问

    /**
     * 添加用户的方法
     * @param user
     * @return
     */
    @Override
    public Integer addUser(User user) {
        if(user != null){
            userMapper.addUser(user);
            return 1;
        }
        return 0;
    }

    /**
     * 查找用户的方法
     * @return
     */
    @Override
    public String find() {
        return userMapper.find();
    }


}
