package com.zoujian.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class TestZoujian {
 @RequestMapping("TestZoujian")
 public String Test(){
  return "HelloZoujian";
 }

}
