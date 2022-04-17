package ru.geekbrains.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.geekbrains.services.Cart;
import ru.geekbrains.services.ConsoleMenage;

@Configuration
@ComponentScan("ru.geekbrains.spring")
public class AppConfig {
    @Bean
    public Cart getCart() {
        return new Cart();
    }

    @Bean
    public ConsoleMenage getConsole() {
        return new ConsoleMenage();
    }
}
