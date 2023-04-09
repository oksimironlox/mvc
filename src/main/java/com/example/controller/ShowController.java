package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ShowController {
    @Autowired
    Shoplist shoplist;

    List<Product> products = new ArrayList<>();

    @RequestMapping("/show")
    public List<Product> home() {
        Product product1 = new Product("Milk");
        Product product2 = new Product("Bread");
        shoplist.add(product1);
        shoplist.add(product2);

        return shoplist.shoplist;
    }
}