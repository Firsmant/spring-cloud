package com.wangcf.cloud.controller;

import com.wangcf.cloud.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: wangcf
 * @Date: 2019/7/10 23:48
 * @Description ${description}
 */
@RestController
@RequestMapping("/movie")
public class MovieController {
    @Autowired
    private RestTemplate restTemplate;

    private String URL = "";

    @GetMapping("/getUserById/{id}")
    public User getUserById(@PathVariable Long id) {
        User user = restTemplate.getForObject("http://localhost:8000/user/" + id, User.class);
        return user;
    }
}
