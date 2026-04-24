package lv.venta;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lv.venta.model.Category;
import lv.venta.model.Product;
import lv.venta.repo.IProductRepo;

@SpringBootApplication
public class Seminar5Application {
	
	public static void main (String [] args) {
		SpringApplication.run(Seminar5Application.class, args);
	}

	public CommandLineRunner testDatabase(IProductRepo prodRepo) {
		return new CommandLineRunner() {
			
			@Override
			public void run(String... args) throws Exception {
				Product productData1 = new Product(2, "Apple", Category.fruits,0.99f,3,"Red");
				Product productData2 = new Product(8, "Spoon", Category.utensils,19.59f,7,"Gold");
				Product productData3 = new Product(6, "lenovo", Category.computers,1200.99f,2,"thinkpad");
				prodRepo.save(productData1);
				prodRepo.save(productData2);
				prodRepo.save(productData3);
				
			}
		};
	}
}
