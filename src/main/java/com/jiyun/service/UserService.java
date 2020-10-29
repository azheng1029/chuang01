package com.jiyun.service;

import com.jiyun.mapper.UserMapper;
import com.jiyun.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired(required = false)
    private UserMapper userMapper;

    public User showname(String uname) {

        User user1 = userMapper.seee(uname);
        return user1;
    }

    public User showupwd(String upwd) {
        User user = new User();
        user.setUpwd(upwd);
        User user1 = userMapper.selectOne(user);
        return user1;
    }

    public void addUser(User user) {
        userMapper.insert(user);
    }
}
