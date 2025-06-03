package com.gamervault.gvgg.services;

import com.gamervault.gvgg.models.ProductosModel;
import com.gamervault.gvgg.repository.ProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductosService {

    @Autowired
    private ProductosRepository repo;

    public ProductosService(ProductosRepository productosRepository) {
        this.repo = productosRepository;
    }

    public List<ProductosModel>  findAll() {

        System.out.println("ProductosService.findAll()");
        return repo.findAll();
    }

}
