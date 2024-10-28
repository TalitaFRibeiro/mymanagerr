package com.example.mymanagerr.product;

import java.time.LocalDate;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;


@Entity
@Table(name = "products")
public class Product {
    @Id
    @SequenceGenerator(
        name = "product_sequence",
        sequenceName = "product_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "product_sequence"
    )
    private Long id_product;
    private String product_name;
    private LocalDate product_check_in;
    private LocalDate product_check_out;
    
    public Product() {
    }
    
    public Product(Long id_produto, String product_name, LocalDate product_check_in, LocalDate product_check_out) {
        this.id_product = id_produto;
        this.product_name = product_name;
        this.product_check_in = product_check_in;
        this.product_check_out = product_check_out;
    }

    public Product(String product_name, LocalDate product_check_in, LocalDate product_check_out) {
        this.product_name = product_name;
        this.product_check_in = product_check_in;
        this.product_check_out = product_check_out;
    }

    public Long getId_produto() {
        return id_product;
    }

    public void setId_produto(Long id_produto) {
        this.id_product = id_produto;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public LocalDate getProduct_check_in() {
        return product_check_in;
    }

    public void setProduct_check_in(LocalDate product_check_in) {
        this.product_check_in = product_check_in;
    }

    public LocalDate getProduct_check_out() {
        return product_check_out;
    }

    public void setProduct_check_out(LocalDate product_check_out) {
        this.product_check_out = product_check_out;
    }

    @Override
    public String toString() {
        return "Product [id_produto=" + id_product + ", product_name=" + product_name + ", product_check_in="
                + product_check_in + ", product_check_out=" + product_check_out + "]";
    }

    

    


    
}


