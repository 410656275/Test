package com.example.redis.impl;

import com.example.redis.StringRedisDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by cc on 17-1-19.
 */
@Repository
public class StringRedisDaoImpl implements StringRedisDao {

    @Autowired
    private StringRedisTemplate template;



    @Override
    public void set(String key, String value) {
        template.opsForValue().set(key,value);
    }

    @Override
    public void append(String key, String value) {
        template.opsForValue().append(key,value);


    }

    @Override
    public String get(String key) {
        return template.opsForValue().get(key);

    }

    @Override
    public String getset(String key, String value) {
        return template.opsForValue().getAndSet(key,value);

    }

    @Override
    public Boolean setnx(String key, String value) {
        return template.opsForValue().setIfAbsent(key,value);
    }
}
