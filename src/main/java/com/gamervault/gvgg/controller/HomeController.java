package com.gamervault.gvgg.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gamervault.gvgg.models.Product;
import com.gamervault.gvgg.service.ProductService;

@RestController
public class HomeController {

    // @Autowired
    private ProductService productServices;
    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/products")
	public List<Product> products(Model model)
	{ 
        return productServices.getAllProducts();
	}

	@GetMapping("/location")
	public String location()
	{
		return "Locate_us";
	}

	@GetMapping("/about")
	public String about()
	{
		return "<h1> About Us </h1>";
	}


}
