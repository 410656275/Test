package com.example.dao.mapper;

import com.example.entity.School;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by cc on 17-1-16.
 */
public interface SchoolMapper {

    School getOne(Integer id);
}
