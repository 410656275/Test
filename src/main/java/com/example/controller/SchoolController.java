package com.example.controller;

import com.example.dao.mapper.SchoolMapper;
import com.example.entity.School;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cc on 17-1-16.
 */
@RestController
public class SchoolController {

    public static final Logger logger = LoggerFactory.getLogger(SchoolController.class);

    @Autowired
    private SchoolMapper schoolMapper;

    @GetMapping("getOne")
    public School getOne(Integer id){

        logger.info("===========come");
//        return null;
        return schoolMapper.getOne(id);
    }


}
