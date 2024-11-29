package com.journal.journal.controller;

import com.journal.journal.entity.User;
import com.journal.journal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/public")
public class PublicController {

    @Autowired
    private UserService userService;

    @PostMapping("/create-user")
    public void createNewUser(@RequestBody User user){
        userService.saveAdmin(user);
    }
}
