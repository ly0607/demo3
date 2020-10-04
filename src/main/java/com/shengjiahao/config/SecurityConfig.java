package com.shengjiahao.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @Author sjh0822
 * @Date 2020/9/24 18:09
 * @Version 1.0
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    //取消加密
    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    //静态资源过滤
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().mvcMatchers("/css/**","/lib-master/**","/axios-master/**","/fonts/**","/images/**","/js/**","/lib/**");



    }
    //请求配置信息
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .anyRequest().authenticated()
                .and()
                //允许表单提交
                .formLogin()
                //配置登陆页面 访问login成功跳入index主页面
                .loginPage("/login").defaultSuccessUrl("/index").permitAll();
        //关闭请求
        http.csrf().disable();
        http.headers().frameOptions().sameOrigin();
    }
}

