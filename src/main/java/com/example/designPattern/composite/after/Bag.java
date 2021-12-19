package com.example.designPattern.composite.after;

import java.util.ArrayList;
import java.util.List;

public class Bag implements ItemComponent{

    private List<ItemComponent> itemComponents = new ArrayList<>();

    public void add(ItemComponent itemComponent) {itemComponents.add(itemComponent);}

    @Override
    public int getPrice() {
        return itemComponents.stream().mapToInt(ItemComponent::getPrice).sum();
    }
}
