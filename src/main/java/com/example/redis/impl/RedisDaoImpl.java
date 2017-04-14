package com.example.redis.impl;

import com.example.redis.RedisDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by cc on 17-1-18.
 */
@Repository
public class RedisDaoImpl implements RedisDao {

    @Autowired
    private StringRedisTemplate template;






}
