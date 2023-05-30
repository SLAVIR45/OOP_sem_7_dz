package Weapon_;

import Abstract_classes.Weapon;

public class Staff extends Weapon {
    private Integer mana;

    public Staff(String name, Integer damage, Integer mana) {
        super(name, damage);
        this.mana = mana;
    }

    public Integer getMana() {
        return mana;
    }
}
