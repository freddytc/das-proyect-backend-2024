package com.example.backend.Controller.Services;

import com.example.backend.Model.Entities.Product;
import com.example.backend.Model.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    // Get all products
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Get a product by ID
    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    // Create or update a product
    public Product saveOrUpdateProduct(Product product) {
        return productRepository.save(product);
    }

    /// Delete a product by ID
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
