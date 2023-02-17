package com.kns.tenquest.controller;

import com.kns.tenquest.entity.User;
import com.kns.tenquest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class JoinController {
    @Autowired
    private UserService userService;

    @GetMapping("/join")
    public String joinUserForm(){
        return "join";
    }

    @PostMapping("/join")
    public String joinUserPro(User user){
//        System.out.println(user.getMember_id());
//        System.out.println(user.getUser_id());
//        System.out.println(user.getUser_info());
//        System.out.println(user.getUser_name());
//        System.out.println(user.getUser_email());
        userService.write(user);


        return "";
    }
}
