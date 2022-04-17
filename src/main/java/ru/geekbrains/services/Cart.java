package ru.geekbrains.services;

import ru.geekbrains.spring.Product;
import ru.geekbrains.spring.ProductRepository;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private final Map<Integer, Product> productMap = new HashMap<>();
    
    private ProductRepository productRepository;

    public Cart() {}
    
    public void addProduct(Product product) {}
}
