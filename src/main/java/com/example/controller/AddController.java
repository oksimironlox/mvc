package com.example.controller;

import com.example.Product;
import com.example.Shoplist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@RestController
@RequestMapping("/rest")
public class AddController {
    @Autowired
    Shoplist shoplist;

    @PostMapping("/add")
    public RedirectView add(@RequestParam String name){
        Product product = new Product(name);
        shoplist.add(product);

        return new RedirectView("/rest/show");
    }
}
