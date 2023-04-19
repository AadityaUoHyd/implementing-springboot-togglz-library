package org.aadi;

import org.aadi.dto.Product;
import org.aadi.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.togglz.core.Feature;
import org.togglz.core.manager.FeatureManager;
import org.togglz.core.util.NamedFeature;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class ToggleSwitchApplication {

    @Autowired
    private FeatureManager featureManager;

    public static final Feature APPLY_DISCOUNT = new NamedFeature("APPLY_DISCOUNT");

    @Autowired
    private InventoryService service;


    @GetMapping("/orders")
    public List<Product> showAvailableProducts() {
        if (featureManager.isActive(APPLY_DISCOUNT)) {
            return applyDiscount(service.getAllProducts());
        } else {
            return service.getAllProducts();
        }
    }

    private List<Product> applyDiscount(List<Product> availableProducts) {
        List<Product> orderListAfterDiscount = new ArrayList<>();
        service.getAllProducts().forEach(order -> {
            order.setPrice(order.getPrice() - (order.getPrice() * 10 / 100));
            orderListAfterDiscount.add(order);
        });
        return orderListAfterDiscount;
    }


    public static void main(String[] args) {
        SpringApplication.run(ToggleSwitchApplication.class, args);
    }

}