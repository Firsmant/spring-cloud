package com.wangcf.cloud.controller;

import com.wangcf.cloud.entity.User;
import com.wangcf.cloud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: wangcf
 * @Date: 2019/7/10 22:29
 * @Description ${description}
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/{id}")
    public User get(@PathVariable Long id) {
        User user = userRepository.getOne(id);
        return user;
    }

    @GetMapping("/page")
    public List<User> page() {
        List<User> userList = userRepository.findAll();
        return userList;
    }
}
