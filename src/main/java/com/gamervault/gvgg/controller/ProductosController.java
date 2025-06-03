package com.gamervault.gvgg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.gamervault.gvgg.models.ProductosModel;
import com.gamervault.gvgg.services.ProductosService;

// import java.util.List;
// import java.util.Optional;

@RestController
@RequestMapping("/productos")
public class ProductosController {

    @Autowired
    private ProductosService productosService;

    @GetMapping
    public List<ProductosModel> getAllProductos() {
       return productosService.findAll();
    }

}
