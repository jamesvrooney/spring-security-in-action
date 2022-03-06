package com.jamesvrooney.service;

import com.jamesvrooney.domain.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
}