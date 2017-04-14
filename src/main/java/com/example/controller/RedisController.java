package com.example.controller;

import com.example.entity.School;
import com.example.redis.RedisDao;
import com.example.redis.StringRedisDao;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisKeyValueTemplate;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.View;

import java.io.Serializable;

/**
 * Created by cc on 17-1-18.
 */
@RestController
@RequestMapping("redis")
public class RedisController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private StringRedisDao redisDao;

    @GetMapping("save")
    public void save(){
        School school = new School();
        school.setName("school");
        school.setAddress("adress");
        school.setId(1);
        Gson gson = new Gson();
        stringRedisTemplate.opsForValue().set("school",gson.toJson(school));
    }

    @GetMapping("set")
    public void set(String key,String value){
        redisDao.set(key,value);
    }





}
