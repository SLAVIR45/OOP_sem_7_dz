package Equipment_;

import Abstract_classes.Equipment;

public class Robe extends Equipment {

    private  Integer mana;

    public Robe(String name, Integer armor, Integer mana) {
        super(name, armor);
        this.mana = mana;
    }

    public Integer getMana() {
        return mana;
    }
}
