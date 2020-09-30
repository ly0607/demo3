package com.zoujian.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestZoujian {
 @RequestMapping("TestZoujian")
 public String Test(){
  return "HelloZoujian";
 }

}
