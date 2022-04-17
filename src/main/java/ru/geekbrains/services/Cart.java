package ru.geekbrains.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import ru.geekbrains.spring.Product;
import ru.geekbrains.spring.ProductRepository;

import java.util.HashMap;
import java.util.Map;
@Scope("prototype")
public class Cart {
    private final Map<Integer, Product> productCart = new HashMap<>();

    @Autowired
    private ProductRepository productRepository;

    public Map<Integer, Product> getProductCart() {
        return productCart;
    }

    public void printCart() {
        for (Map.Entry<Integer, Product> entry: productCart.entrySet()) {
            Product p = entry.getValue();
            System.out.println(p.getName() + ": " + p.getCost());
        }
    }

    public void addProduct(Product product) {
        productCart.put(product.getId(), product);
    }

    public void removeProduct(Product product) {
        productCart.remove(product.getId());
    }
}
