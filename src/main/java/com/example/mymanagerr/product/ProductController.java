package com.example.mymanagerr.product;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import lombok.RequiredArgsConstructor;

//




@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;
    
    
    
    @GetMapping("/productsall")
	public List<Product> getProduct(){
		return productService.getProduct();
	}



    /* 
    private final ProductService productService;

     // makes the final productService be connected and instanciated and injected in this constructer
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
	public List<Product> getProduct(){
        return productService.getProduct();
	} */
    /*@GetMapping
     public ResponseEntity getAllProducts(){
        return ResponseEntity.ok("It's alright");

    }  */
}
