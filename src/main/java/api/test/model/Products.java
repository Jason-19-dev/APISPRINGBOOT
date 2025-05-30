package api.test.model;
import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
// example from https://docs.spring.io/spring-boot/reference/data/sql.html
@Entity
public class Products implements Serializable {

	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false,name="product_name")
	private String name;

	@Column(nullable = false)
	private String price;

	protected City() {
		// no-args constructor required by JPA spec
		// this one is protected since it should not be used directly
	}

	public City(String name, String state) {
		this.name = name;
		this.state = state;
	}

	public String getName() {
		return this.name;
	}

	public String getState() {
		return this.;
	}

	// ... etc

}