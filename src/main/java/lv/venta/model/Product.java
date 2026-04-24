package lv.venta.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;


@Entity
@Table(name = "ProductTable")
public class Product {
	//1. variables
	@NotNull
	@NotEmpty
	@Pattern(regexp = "[A-Z]{1}[a-z]{2,40}")
	@Column(name = "title")
	
	private String title;
	@Column(name = "Category")
	@NotNull
	@Enumerated(EnumType.STRING)
	
	private Category category;
	
	@Column(name = "Price")
	
	@Min(0)
	@Max(10000)
	private float price;

	@Column(name = "Quantity")
	@Min(0)
	@Max(1000)
	private int quantity;
	
	@Column(name = "description")
	@NotNull
	@NotEmpty
	//TODO add @pattern if you want
	
	
	private String description;
	
	@Column(name = "Id")
	@Id//this means that column values will be unique
	@GeneratedValue(strategy = GenerationType.AUTO)
	//TODO  set id unique
	private int id;
	//2. getters & setters
	//TODO create validations
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	//5. both args const
	public Product() {}
	public Product(int id, String title, Category category, float price, int quantity, String description) {
		setId(id);
		setTitle(title);
		setCategory(category);
		setPrice(price);
		setDescription(description);
		setQuantity(quantity);
		
}
	
	public Product(String title, Category category, float price, int quantity, String description) {
		
		setTitle(title);
		setCategory(category);
		setPrice(price);
		setDescription(description);
		setQuantity(quantity);
		
}
	
	//6. to string
	public String toString() {
		String result = id +": "+ title + ", "+ price + " eur,"
				+"{" + category + "}";
		return result;
	}

}
