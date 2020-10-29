package com.jiyun.mapper;

import com.jiyun.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.BaseMapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
    @Select("select * from user where uname=#{uname}")
    public User shownaem(User user);
    @Select("select * from user where upwd=#{upwd}")
    public User showpwd(User user);
    @Select("select * from user where uname=#{uname}")
    User seee(String uname);
}
