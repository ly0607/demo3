package com.shengjiahao.services;

import com.shengjiahao.bean.Users;

/**
 * @Author sjh0822
 * @Date 2020/10/3 9:56
 * @Version 1.0
 */
public interface UserServices {
    /**
     * 功能描述: 根据账号 查询个人
     * @param: [uname]
     * @return com.shengjiahao.bean.Users
     * @author sjh0822
     * @date 2020/10/3 9:56
     */
    Users selectUserByUname(String uname);
}
