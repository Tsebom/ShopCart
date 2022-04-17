package ru.geekbrains.services;

import org.springframework.beans.factory.annotation.Autowired;
import ru.geekbrains.spring.ProductRepository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleMenage {
    @Autowired
    private Cart cart;
    @Autowired
    private ProductRepository productRepository;

    private final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public void menage() {
        String command;
        String[] token;
        while (true) {
            try {
                command = bufferedReader.readLine();
                token = command.split(" ");
                if (command.equals("-1")) {
                    break;
                } else if (command.startsWith("add")) {
                    cart.addProduct(productRepository.getProductById(Integer.parseInt(token[1])));
                } else if (command.startsWith("rm")) {
                    cart.removeProduct(productRepository.getProductById(Integer.parseInt(token[1])));
                }
                System.out.println("the products in the cart");
                cart.printCart();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
