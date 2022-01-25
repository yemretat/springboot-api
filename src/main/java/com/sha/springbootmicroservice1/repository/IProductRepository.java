package com.sha.springbootmicroservice1.repository;

import com.sha.springbootmicroservice1.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IProductRepository extends JpaRepository<Product,Long>  {
}
