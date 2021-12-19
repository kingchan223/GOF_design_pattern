package com.example.designPattern.composite.before;

public class Client {
    public static void main(String[] args) {
        Weapon scar = new Weapon("scar", 450);                     //new Weapon
        Medicine whitePosition = new Medicine("whitePosition", 50);//new Medicine
        Amour goldAmour = new Amour("GoldAmour", 700);             //new Amour

        Bag bag = new Bag();           //new Bag
        bag.addWeapon(scar);           //bag에 weapon추가
        bag.addMedicine(whitePosition);//bag에 medicine추가
        bag.addAmour(goldAmour);       //bag에 amour추가

        Client client = new Client();            //Client
        client.printPrice(scar);                 //--> 450
        client.printPrice(whitePosition);        //--> 50
        client.printPrice(goldAmour);            //--> 700
        client.printPrice(bag);                  //--> 500
    }
    //가방에 있는 모든 아이템 가격 총합
    private void printPrice(Bag bag) {
        int sum = 0;
        sum += bag.getWeapon().getPrice();
        sum += bag.getMedicine().getPrice();
        sum += bag.getAmour().getPrice();/*추가*/
        System.out.println(sum);
    }
    //무기 하나의 가격
    private void printPrice(Weapon weapon) {
        System.out.println(weapon.getPrice());
    }
    //약 하나의 가격
    private void printPrice(Medicine medicine) {
        System.out.println(medicine.getPrice());
    }
    private void printPrice(Amour amour) {/*추가*/
        System.out.println(amour.getPrice());
    }
}
