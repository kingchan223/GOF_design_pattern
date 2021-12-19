package com.example.designPattern.composite.before;

public class Bag {

    Weapon weapon;
    Medicine medicine;
    Amour amour;/*추가*/

    public void addWeapon(Weapon weapon) {this.weapon = weapon;}

    public void addMedicine(Medicine medicine) {this.medicine = medicine;}

    public void addAmour(Amour amour) {this.amour = amour;}/*추가*/

    public Weapon getWeapon() {return weapon;}

    public void setWeapon(Weapon weapon) {this.weapon = weapon;}

    public Medicine getMedicine() {return medicine;}

    public void setMedicine(Medicine medicine) {this.medicine = medicine;}

    public Amour getAmour() {return amour;}

    public void setAmour(Amour amour) {this.amour = amour;}
}
