package com.delani.webPrj.controllers;


import com.delani.webPrj.model.Product;
import com.delani.webPrj.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getProducts() {
        return service.getProducts();
    }


    @GetMapping("/products/{id}")
    public Product getProductById (@PathVariable int id) {
        return service.getProductById(id);
    }

    @PostMapping ("/products")
    public void addProduct(@RequestBody Product product) {
         service.addProduct(product);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Product product){
        service.updateProduct(product);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable int id){
        service.deleteProduct(id);
    }
}
