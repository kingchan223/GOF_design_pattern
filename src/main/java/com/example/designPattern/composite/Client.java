package com.example.designPattern.composite;

public class Client {
    public static void main(String[] args) {
        Item 쿠드리 = new Item("쿠드리", 450);
        Item 파워엘릭서 = new Item("파워엘릭서", 50);

        Bag bag = new Bag();
        bag.add(쿠드리);
        bag.add(파워엘릭서);

        Client client = new Client();
        client.printPrice(쿠드리);
        client.printPrice(bag);
    }

    //가방에 있는 모든 아이템 가격 총합
    private void printPrice(Bag bag) {
        int sum = bag.getItems().stream().mapToInt(Item::getPrice).sum();
        System.out.println(sum);
    }
    //아이템 하나의 가격
    private void printPrice(Item item) {
        System.out.println(item.getPrice());
    }
}
