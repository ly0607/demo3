package com.liuying.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class PageController {
    //投标项目信息登记
    @RequestMapping("infoAdd")
    public String info(){
        return "tender-info-add";
    }

    //项目信息查看
    @RequestMapping("infoShow")
    public String infoShow(){
        return "tender-info-Show";
    }

    //项目信息查询
    @RequestMapping("infoSelect")
    public String infoSelect(){
        return "tender-info-select";
    }
}
