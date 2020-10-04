package com.shengjiahao.dome;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.bcrypt.BCrypt;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        String sjh = BCrypt.hashpw("sjh", BCrypt.gensalt());
        String wlj = BCrypt.hashpw("wlj", BCrypt.gensalt());
        String zj = BCrypt.hashpw("zj", BCrypt.gensalt());
        String lc = BCrypt.hashpw("lc", BCrypt.gensalt());
        String lx = BCrypt.hashpw("sjh", BCrypt.gensalt());
        System.out.println("sjh" + sjh);
        System.out.println("wlj" + wlj);
        System.out.println("lc" + lc);
        System.out.println("lx" + lx);
        System.out.println("zj" + zj);


    }
    @Test
    void contextLoad() {
        System.out.println("邹健");
    }
    @Test
    void contextLoadss(){
        System.out.println("王莲杰测试");
    }

    @Test
    void test01(){
        System.out.println("2020-10-03  09:13");

    }



}
