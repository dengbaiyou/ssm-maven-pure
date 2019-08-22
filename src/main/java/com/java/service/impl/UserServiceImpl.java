package com.java.service.impl;

import com.github.pagehelper.PageHelper;
import com.java.mapper.UserMapper;
import com.java.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public List<Map<String, Object>> findUser(Integer pageNum, Integer pageSize) {
        //分页
        PageHelper.startPage(pageNum, pageSize);
        return userMapper.selectUsers();
    }
}
