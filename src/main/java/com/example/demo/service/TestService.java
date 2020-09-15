package com.example.demo.service;

import com.example.demo.entity.User;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    public User setUser(User user) {
        System.out.println("uuu");
        System.out.println("uuuuu");
        return user;
    }
}
