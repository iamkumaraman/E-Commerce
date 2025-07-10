package com.ecommerce.project.service;

import com.ecommerce.project.payload.ProductDTO;
import org.springframework.stereotype.Service;


public interface ProductService {
    ProductDTO addProduct(ProductDTO productDTO, Long categoryId);
}
