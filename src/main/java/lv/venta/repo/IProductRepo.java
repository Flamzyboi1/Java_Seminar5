package lv.venta.repo;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import lv.venta.model.Category;
import lv.venta.model.Product;

public interface IProductRepo extends CrudRepository<Product,Integer> {

	
	//Only Abstract functions will be there

	boolean existsByTitleAndCategoryAndPriceAndQuantityAndDescription(String title, Category category, float price,
			int quantity, String description);

	ArrayList<Product> findByCategory(Category category);

	ArrayList<Product> findByPriceLessThan(float priceLevel);


	
	@Query(nativeQuery = true, value = "Select AVG(PRICE) FROM PRODUCT_TABLE;")
	float myCalculateAvgPrice();

	ArrayList<Product> findByTitleContainingOrDescriptionContaining(String keyword, String keyword2);


	

}
