package lv.venta.repo;

import org.springframework.data.repository.CrudRepository;

import lv.venta.model.Category;
import lv.venta.model.Product;

public interface IProductRepo extends CrudRepository<Product,Integer> {

	boolean existByTitleAndCategoryAndPriceAndQuantityAndDescription(String title, Category category, float price,
			int quantity, String description);
	//Only Abstract functions will be there

}
