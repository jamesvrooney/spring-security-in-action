package com.jamesvrooney.service.impl;

import com.jamesvrooney.domain.Product;
import com.jamesvrooney.repository.ProductRepository;
import com.jamesvrooney.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }
}
