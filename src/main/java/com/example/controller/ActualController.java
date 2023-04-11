package com.example.controller;

import com.example.Product;
import com.example.Shoplist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@RestController
@RequestMapping("/rest")
public class ActualController {
    @Autowired
    Shoplist shoplist;

    @PatchMapping("/actual")
    public RedirectView add(@RequestParam String actual, @RequestParam String name){
        Product product = shoplist.search(name);
        shoplist.updateActual(actual, name);

        return new RedirectView("/rest/show");
    }
}
