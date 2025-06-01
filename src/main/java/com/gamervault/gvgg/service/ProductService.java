package com.gamervault.gvgg.service;
import com.gamervault.gvgg.models.Product;
import java.util.ArrayList;
import java.util.List;

public class ProductService {

    public List<Product> getAllProducts() {

        List<Product> dataList = new ArrayList<>();
        dataList.add(new Product(1, "Product 1", "Description 1", 10.99, "image1.jpg", "Category 1"));
        dataList.add(new Product(2, "Product 2", "Description 2", 19.99, "image2.jpg", "Category 2"));
        dataList.add(new Product(3, "Product 3", "Description 3", 29.99, "image3.jpg", "Category 3"));
        System.out.println(dataList);
        return dataList;
    }
}
