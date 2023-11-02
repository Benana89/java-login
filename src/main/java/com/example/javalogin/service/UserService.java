package com.example.javalogin.service;

import java.util.List;

import com.example.javalogin.dto.UserDto;
import com.example.javalogin.entity.User;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByUserName(String userName);

}
