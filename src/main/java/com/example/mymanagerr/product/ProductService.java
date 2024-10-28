package com.example.mymanagerr.product;
import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;




@Service
@RequiredArgsConstructor
public class ProductService {
	
	private final ProductRepository productRepository;
    
	
	
	public List<Product> getProduct(){
		return productRepository.findAll();
        
	}
}
