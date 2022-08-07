package com.springBootDemo.Intro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {

	@GetMapping("/")
	public String get() {
		return "Laptop";
	}

	@GetMapping("/products")
	public String get2() {
		return "laptop 2asdas";
	}

	@GetMapping("/test")
	public String get3() {
		return "Test ayfaso";
	}
}
