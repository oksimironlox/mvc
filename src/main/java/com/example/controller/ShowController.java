package com.example.controller;

import com.example.Product;
import com.example.Shoplist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/rest")
public class ShowController {
    @Autowired
    Shoplist shoplist;

    List<Product> products = new ArrayList<>();

    /*@RequestMapping("/")
    public String home() {
        //products = shoplist.getList();
        return "aoa";
    }*/

    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public List<Product> home() {
        List<Product> shopList = shoplist.getList();
        //ModelAndView mav = new ModelAndView("main");
        //mav.addObject("shoplist", shopList);
        return shopList;
    }
}