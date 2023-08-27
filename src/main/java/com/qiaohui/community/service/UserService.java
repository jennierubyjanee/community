package com.qiaohui.community.service;

import com.qiaohui.community.dao.UserMapper;
import com.qiaohui.community.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zqh
 * @create 2023-08-23-10:52
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;
    public User findUserById(int id){
        return  userMapper.selectById(id);
    }

}
