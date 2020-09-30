package com.zoujian.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class TestZoujian {
 @RequestMapping("TestZoujian")
 public String Test(){
  return "HelloZoujian";
 }

}
