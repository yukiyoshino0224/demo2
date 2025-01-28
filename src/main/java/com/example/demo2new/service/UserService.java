package com.example.demo2new.service;

import org.springframework.stereotype.Service;

import com.example.demo2new.domain.User;



@Service
public class UserService {

    public User save(User user){
        System.out.println("UserServiceのsaveが呼ばれました");
        return user;
    }

}