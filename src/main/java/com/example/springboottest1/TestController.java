package com.example.springboottest1;

import com.example.springboottest1.entity.User;
import com.example.springboottest1.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    public UserServiceImpl userService;
    @RequestMapping("/index")
    public String index(){
        return "Hello World!";
    }

    @RequestMapping("/select")
    public User select(int id){
       User user = userService.selectByPrimaryKey(id);
        return user;
    }
}
