package com.example;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Shoplist {
    private List<Product> shoplist;

    public Shoplist(){
        shoplist = new ArrayList<Product>();
    }

    public void add(Product product){
        if(shoplist.size() > 0)
        {
            product.setId(shoplist.get(shoplist.size()-1).getId()+1);
        }
        else{
            product.setId(1);
        }

        shoplist.add(product);
    }

    public List<Product> getList(){
        return shoplist;
    }

    public void delete(String name){
        /*for(int i = 0; i < shoplist.size(); i++){
            if(name.equals(shoplist.get(i).getName())){
                shoplist.remove(i);
            }
        }*/
        Product product = search(name);
        shoplist.remove(product);
    }

    public Product search(String name){
        for(int i = 0; i < shoplist.size(); i++){
            if(name.equals(shoplist.get(i).getName())){
                return shoplist.get(i);
            }
        }
        return null;
    }

    public void updateActual(String actual, String name){
        Product product = search(name);
        //shoplist.get(product.getId());
        product.actual(actual);
    }
}
