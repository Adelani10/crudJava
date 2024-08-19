package com.delani.webPrj.services;

import com.delani.webPrj.model.Product;
import com.delani.webPrj.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class ProductService {
    @Autowired
    ProductRepo repo;

//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(1, "Samsung", 500),
//            new Product(2, "Tecno", 400),
//            new Product(3, "Iphone", 800)
//    ));


    public List<Product> getProducts() {
        return repo.findAll();
    }

    public Product getProductById(int id) {
        return repo.findById(id).orElse(new Product(0, null, 0));
    }

    public void addProduct(Product product){
         repo.save(product);
    }

    public void updateProduct(Product product) {
        repo.save(product);
    }

    public void deleteProduct(int id) {
        repo.deleteById(id);
    }
}
