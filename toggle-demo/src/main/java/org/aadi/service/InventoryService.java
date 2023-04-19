package org.aadi.service;

import org.aadi.dto.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class InventoryService {

    public List<Product> getAllProducts() {
        return Stream.of(new Product(101, "TV", 60000),
                new Product(102, "iPhone", 80000),
                new Product(103, "Shoes", 3000)
                , new Product(104, "Pen", 100)
        ).collect(Collectors.toList());
    }
}
