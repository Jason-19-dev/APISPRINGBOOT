// packeage api.test.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RestMapping("/products")
public class ProductsResponse {
 
	private List<Product> products = new ArrayList<>();
	@GetMapping("/{productId}")
	public User getProduct(@PathVariable Long productId) {
		
		return null;
	}

	@DeleteMapping("/{productId}")
	public void deleteProduct(@PathVariable Long productId) {
		return null;
	}
}
