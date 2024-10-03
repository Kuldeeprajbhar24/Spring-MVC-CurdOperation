package com.crudspringmvc.MVC_Crud_Operation.service;

import org.springframework.data.jpa.repository.JpaRepository;
import com.crudspringmvc.MVC_Crud_Operation.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    
}
