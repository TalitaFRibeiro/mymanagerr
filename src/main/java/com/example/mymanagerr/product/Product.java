package com.example.mymanagerr.product;

import java.time.LocalDate;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import lombok.Data;


@Entity
@Table(name = "products")
@Data
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
    @Column(name = "id_product")
    private Long idProduct;
    @Column(name = "product_name", nullable = false)
    private String productName;
    @Column(name = "product_check_in", nullable = false)
    private LocalDate productCheckIn;
    @Column(name = "product_check_out")
    private LocalDate productCheckOut;
    
    public Product() {
    }
    
    public Product(Long idProduct, String productName, LocalDate productCheckIn, LocalDate productCheckOut) {
        this.idProduct = idProduct;
        this.productName = productName;
        this.productCheckIn = productCheckIn;
        this.productCheckOut = productCheckOut;
    }

    public Product(String product_name, LocalDate productCheckIn, LocalDate productCheckOut) {
        this.productName = product_name;
        this.productCheckIn = productCheckIn;
        this.productCheckOut = productCheckOut;
    }

    public Long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public LocalDate getProductCheckIn() {
        return productCheckIn;
    }

    public void setProductCheckIn(LocalDate productCheckIn) {
        this.productCheckIn = productCheckIn;
    }

    public LocalDate getProductCheckOut() {
        return productCheckOut;
    }

    public void setProductCheckOut(LocalDate productCheckOut) {
        this.productCheckOut = productCheckOut;
    }

    @Override
    public String toString() {
        return "Product [id_product=" + idProduct + ", product_name=" + productName + ", product_check_in="
                + productCheckIn + ", productCheckOut=" + productCheckOut + "]";
    }

    

    


    
}


