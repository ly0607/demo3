package com.shengjiahao.mapper;

import com.shengjiahao.bean.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Author sjh0822
 * @Date 2020/10/3 9:53
 * @Version 1.0
 */
@Mapper
public interface UsersMapper {

    @Select("select * from Users where uname=#{uname}")
    Users selectUserByUname(String uname);
}
