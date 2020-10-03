package com.shengjiahao.services.impl;

import com.shengjiahao.bean.Users;
import com.shengjiahao.mapper.UsersMapper;
import com.shengjiahao.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author sjh0822
 * @Date 2020/10/3 9:57
 * @Version 1.0
 */
@Service
public class UserServicesimpl implements UserServices {
    @Autowired
    UsersMapper usersMapper;
    /**
     * 功能描述: 根据账号 查询个人
     *
     * @param uname
     * @return com.shengjiahao.bean.Users
     * @param: [uname]
     * @author sjh0822
     * @date 2020/10/3 9:56
     */
    @Override
    public Users selectUserByUname(String uname) {
        return usersMapper.selectUserByUname(uname);
    }
}
