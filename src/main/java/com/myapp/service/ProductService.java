package com.myapp.service;

import org.springframework.stereotype.Service;

import com.myapp.model.Product;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    
    public List<Product> getProducts() {
        // Logic to fetch the list of products
        // Replace this with your actual implementation

        List<Product> products = new ArrayList<>();
        products.add(new Product("iPhone", 999.99));
        products.add(new Product("MacBook", 1999.99));
        products.add(new Product("iMac", 1499.99));
        products.add(new Product("MacMini", 799.99));
        products.add(new Product("iPad", 499.99));

        return products;

    }
}