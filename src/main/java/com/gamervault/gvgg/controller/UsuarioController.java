package com.gamervault.gvgg.controller;
import com.gamervault.gvgg.models.UsersModel;
import com.gamervault.gvgg.services.UsersService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsuarioController {

    @Autowired
    private UsersService usersService;

    @GetMapping
    public List<UsersModel> prueba() {

        return usersService.listar();
    }

    @PostMapping
    public List<UsersModel> add(){
        
        usersService.guardar(null);
        return null;
    }
    
   
}
