package com.example.springboottest1.service;

import com.example.springboottest1.entity.User;

public interface UserService {
    int deleteByPrimaryKey(int id);
    int insert(User record);
    int insertSelective(User record);
    User selectByPrimaryKey(int id);
    int updateByPrimaryKeySelective(User record);
    int updateByPrimaryKey(User record);
}