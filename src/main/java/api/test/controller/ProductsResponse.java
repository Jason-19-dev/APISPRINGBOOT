package api.test.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductsResponse {
 
    // private List<Product> products = new ArrayList<>();
    @GetMapping("/product")
    public String getProducts() {
		
		return "<h1>Product is found</h1>";
	}
}
