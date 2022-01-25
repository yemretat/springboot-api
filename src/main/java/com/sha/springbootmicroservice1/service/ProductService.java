package com.sha.springbootmicroservice1.service;


import com.sha.springbootmicroservice1.model.Product;
import com.sha.springbootmicroservice1.repository.IProductRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ProductService implements IProductService {

    private final IProductRepository _productRepository;

    public ProductService(IProductRepository productRepository)
    {
        this._productRepository = productRepository;
    }

    @Override
    public Product saveProduct (Product product)
    {
        product.setCreateTime(LocalDateTime.now());
        return _productRepository.save(product);
    }

    @Override
    public void deleteProduct(Long productId)
    {
        _productRepository.deleteById(productId);
    }

    @Override
    public List<Product> findAllProducts()
    {
        return _productRepository.findAll();
    }
}
