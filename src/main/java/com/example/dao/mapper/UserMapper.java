package com.example.dao.mapper;

import com.example.entity.UserEntity;

import java.util.List;

/**
 * Created by cc on 17-1-13.
 */
public interface UserMapper {

    List<UserEntity> getAll();

    UserEntity getOne(Long id);

    void insert(UserEntity userEntity);

    void update(UserEntity userEntity);

    void delete(Long id);
}
