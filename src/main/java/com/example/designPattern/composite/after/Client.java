package com.example.designPattern.composite.after;

public class Client {
    public static void main(String[] args) {

        ItemComponent scar = new Weapon("scar", 450);
        ItemComponent whitePotion = new Medicine("whitePotion", 50);
        ItemComponent goldAmour = new Amour("goldAmour", 700);

        Bag bag = new Bag();
        bag.add(scar);
        bag.add(whitePotion);
        bag.add(goldAmour);

        Client client = new Client();
        client.printPrice(scar);          // 450
        client.printPrice(whitePotion);   // 50
        client.printPrice(goldAmour);     // 700

        client.printPrice(bag);           // 1200
    }

    //bag 이나 item 이 아닌 Component 를 사용함으로써, 추상적인 타입을 사용.
    private void printPrice(ItemComponent itemComponent) {
        System.out.println(itemComponent.getPrice());
    }
}
