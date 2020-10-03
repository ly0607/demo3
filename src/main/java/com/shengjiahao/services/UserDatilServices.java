package com.shengjiahao.services;

import com.shengjiahao.bean.Users;
import com.shengjiahao.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

/**
 * @Author sjh0822
 * @Date 2020/9/24 20:35
 * @Version 1.0
 */
@Configuration
public class UserDatilServices implements UserDetailsService {

    @Autowired
    UserServices userServices;


    @Override
    public UserDetails loadUserByUsername(String uname) throws UsernameNotFoundException {
        System.out.println(uname);
        //第一种写法 一般做角色权限使用
        //List<GrantedAuthority> list = new ArrayList<>();
        //UserDetails userDetails = new User("tom","123",list);
        //SysUser sysUser = sysUserServices.selectSysUserByUname(uname);
        //System.out.println(sysUser);
        //if (sysUser==null){
        //    System.out.println("没有此用户");
        //    return null;
        //}
        //List<String> list = sysUserServices.selectPresByUid(sysUser.getUid());
        //System.out.println(list);
        //集合转换数组
        //String[] strings = list.toArray(new String[list.size()]);
        Users users = userServices.selectUserByUname(uname);
        System.out.println(users);
        UserDetails userDetails = User.withUsername(uname).password(users.getUpwd()).authorities("a1").build();
        return userDetails;
    }
}
