packeage api.test.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;


@RestController
@RestMapping("/products")
public class ProductsResponse {
 
	// private List<Product> products = new ArrayList<>();
	@GetMapping("/{productId}")
	public void getProduct() {	
		
		return null;
	}

	@DeleteMapping("/{productId}")
	public void deleteProduct() {
		return null;
	}
}
