package com.example.controller;

import com.example.dao.mapper.UserMapper;
import com.example.entity.UserEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by cc on 17-1-16.
 */
@RestController
@RequestMapping("base")
public class BaseController {

    public static final Logger logger = LoggerFactory.getLogger(BaseController.class);

    @Autowired
    private UserMapper userMapper;

    @GetMapping("test1")
    public String test1(){
        return "hello spring boot";
    }

    @GetMapping("/users")
    public List<UserEntity> sya3(){
        logger.info("===============users");
        return userMapper.getAll();
    }
}
