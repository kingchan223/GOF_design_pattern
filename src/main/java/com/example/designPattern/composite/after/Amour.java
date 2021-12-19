package com.example.designPattern.composite.after;

public class Amour implements ItemComponent{
    String name;
    int price;

    public Amour(String name, int price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public int getPrice() {return price;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public void setPrice(int price) {this.price = price;}
}
