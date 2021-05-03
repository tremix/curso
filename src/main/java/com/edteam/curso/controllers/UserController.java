package com.edteam.curso.controllers;

import com.edteam.curso.models.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @RequestMapping(value = "/holamundo", method = RequestMethod.GET)
    User holaMundo(){
        User user = new User();
        user.setNombre("Nicolas");
        user.setApellido("Prado");
        return user;
    }
}
