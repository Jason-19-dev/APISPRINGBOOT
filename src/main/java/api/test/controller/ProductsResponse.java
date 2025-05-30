packeage api.test.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;
import api.test.model.Product;


@RestController
@RestMapping("/products")
public class ProductsResponse {
 
	private List<Product> products = new ArrayList<>();
	@GetMapping("/{productId}")
	public Product getProduct() {
		
		return null;
	}

	@DeleteMapping("/{productId}")
	public void deleteProduct() {
		return null;
	}
}
