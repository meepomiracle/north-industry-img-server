package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by hadoop on 2016/8/6.
 */
@Controller
@RequestMapping("/controller")
public class BaseController {

    @RequestMapping(value = "/hello.do",method = RequestMethod.GET)
    @ResponseBody
    public String hello(){
        return "hello ,img server";
    }

}
