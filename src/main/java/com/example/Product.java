package com.example;

public class Product {

    private int id;
    private String name;
    private String actual;



    public Product(){

    }

    public Product(String name){
        this.name = name;
        this.actual = "need to buy";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void actual(String text){
        actual = actual = text;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getActual() {
        return actual;
    }

    public int getId() {
        return id;
    }

    public String getName(){
        return name;
    }
}
