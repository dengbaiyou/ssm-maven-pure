package com.java.controller;

import com.github.pagehelper.PageInfo;
import com.java.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        return "hello";
    }

    @RequestMapping("/show")
    @ResponseBody
    public List<Map<String, Object>> show(Integer pageNum, Integer pageSize) {
        List<Map<String, Object>> user = userService.findUser(pageNum, pageSize);
        PageInfo<Map<String, Object>> pageInfo = new PageInfo<>(user);
        return pageInfo.getList();
    }
}
