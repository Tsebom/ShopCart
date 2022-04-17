package ru.geekbrains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.geekbrains.config.AppConfig;
import ru.geekbrains.services.ConsoleMenage;
import ru.geekbrains.spring.Product;
import ru.geekbrains.spring.ProductRepository;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        ProductRepository productRepository = context.getBean(ProductRepository.class);

        productRepository.addProduct(context.getBean(Product.class, 1, "Nokia", 5.67));
        productRepository.addProduct(context.getBean(Product.class, 2, "Samsung", 6.67));
        productRepository.addProduct(context.getBean(Product.class, 3, "Bell", 7.67));
        productRepository.addProduct(context.getBean(Product.class, 4, "Sony", 8.67));
        productRepository.addProduct(context.getBean(Product.class, 5, "LG", 9.67));

        context.getBean(ConsoleMenage.class).menage();
    }
}
