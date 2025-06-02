package com.gamervault.gvgg.services;

import com.gamervault.gvgg.models.ProductosModel;
import com.gamervault.gvgg.repository.ProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
// import java.util.Optional;

@Service
public class ProductosService {

    @Autowired
    private ProductosRepository productosRepository;

    public String findAll() {
        System.out.println("ProductosService.findAll()");
        // List<ProductosModel> productos = productosRepository.findAll();
        // return productos.toString();
        return "ProductosService.findAll()";
    }

}
