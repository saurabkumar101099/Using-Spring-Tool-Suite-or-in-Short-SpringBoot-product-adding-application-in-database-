package com.spring.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/addProduct")
	public ModelAndView addProduct(@RequestParam("productId") int id,@RequestParam("productName")String name,@RequestParam("productPrice") int price) {
	
		Product product= new Product();
		product.setProductId(id);
		product.setProductName(name);
		product.setProductPrice(price);
		productService.addProduct(product);//invoke mode; /service/action class
		return new ModelAndView("sucessproduct.jsp");//invoke view
	}
	
	
	

}
