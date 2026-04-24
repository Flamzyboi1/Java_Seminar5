package lv.venta.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lv.venta.model.Category;
import lv.venta.model.Product;

@Controller
public class SimpleController {

	@GetMapping("/simple")//localhost:8080/simple
	public String getControllerSimple() {
		System.out.println("the simple controller is running");
		return"simple-page";//will show simple-page.html file
	}
	@GetMapping ("/data")//localhost:8080/data
	public String getControllerData(Model model) {
		System.out.println("The Data Conrtoller is Running");
		Random random = new Random();
		String myData = "@ Favour, "+ random.nextInt(2020,2026);
		
		model.addAttribute("box",myData);
		return "data-page";//will show data-page.html file
	}
	@GetMapping("/product")//localhost:8080/product
	public String getControllerProduct(Model model) {
		System.out.println("The product controller is running");
		Product productData = new Product(2, "Apple", Category.fruits,0.99f,3,"Red");
		model.addAttribute("box",productData);
		return "product-page";//will show product page.html file
		
	}
	@GetMapping("/all-products")//localhost:8080/all-product
	public String getControllerAllProducts(Model model) {
		System.out.println("The All-product controller is running");
		Product productData1 = new Product(2, "Apple", Category.fruits,0.99f,3,"Red");
		Product productData2 = new Product(8, "Spoon", Category.utensils,19.59f,7,"Gold");
		Product productData3 = new Product(6, "lenovo", Category.computers,1200.99f,2,"thinkpad");
		ArrayList<Product>allProducts=
				new ArrayList<Product>
		(Arrays.asList(productData1,productData2,productData3));
		model.addAttribute("box",allProducts);
		return "all-products-page";//will show product page.html file
		
}
}
