package com.example.controller;

import com.example.Shoplist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@RestController
@RequestMapping("/rest")
public class DeleteController {
    @Autowired
    Shoplist shoplist;

    @DeleteMapping("/delete")
    public RedirectView delete(@RequestParam String name){
        shoplist.delete(name);
        return new RedirectView("/rest/show");
    }
}
