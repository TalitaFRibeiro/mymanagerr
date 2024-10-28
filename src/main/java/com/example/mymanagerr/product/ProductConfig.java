package com.example.mymanagerr.product;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfig {

    @Bean
    CommandLineRunner commandLineRunner(ProductRepository repository){
        return args -> {
            Product telephone = new Product(1L,
            "Telefone",
             LocalDate.of(2024,Month.OCTOBER,13), 
		LocalDate.of(2024,Month.OCTOBER,15));
		
            Product computer =  new Product(1L,
            "Computer",
             LocalDate.of(2024,Month.OCTOBER,13), 
		LocalDate.of(2024,Month.OCTOBER,15));

        repository.saveAll(
            List.of(telephone, computer)
        );
        } ;

    }
}
