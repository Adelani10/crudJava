package com.delani.webPrj;

import com.delani.webPrj.controllers.ProductController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class WebPrjApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(WebPrjApplication.class, args);

		ProductController obj = context.getBean(ProductController.class);

	}

}
