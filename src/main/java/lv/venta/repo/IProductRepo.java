package lv.venta.repo;

import org.springframework.data.repository.CrudRepository;

import lv.venta.model.Category;
import lv.venta.model.Product;

public interface IProductRepo extends CrudRepository<Product,Integer> {

	
	//Only Abstract functions will be there

	boolean existsByTitleAndCategoryAndPriceAndQuantityAndDescription(String title, Category category, float price,
			int quantity, String description);

}
