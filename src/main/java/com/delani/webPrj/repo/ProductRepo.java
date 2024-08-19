package com.delani.webPrj.repo;

import com.delani.webPrj.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
