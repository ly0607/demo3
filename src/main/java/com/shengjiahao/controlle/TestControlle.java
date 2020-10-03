package com.shengjiahao.controlle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author sjh0822
 * @Date 2020/9/30 8:37
 * @Version 1.0
 */
@Controller
public class TestControlle {

    @RequestMapping("login")
    public String Test(){
        return "login";
    }

    @RequestMapping("index")
    public String index(){
        return "index";
    }
}
