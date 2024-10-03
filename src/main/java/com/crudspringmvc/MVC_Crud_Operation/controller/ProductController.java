package com.crudspringmvc.MVC_Crud_Operation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crudspringmvc.MVC_Crud_Operation.model.Product;
import com.crudspringmvc.MVC_Crud_Operation.service.ProductRepository;

@Controller
@RequestMapping("/product")
public class ProductController {
    
    @Autowired  private ProductRepository repo;
    @GetMapping("/create")
    public String showAllProductList(Model model) {
        List<Product> products = repo.findAll();
        model.addAttribute("products", products);
        return "products/index";  // This should match the actual path in your templates folder
    }
}
