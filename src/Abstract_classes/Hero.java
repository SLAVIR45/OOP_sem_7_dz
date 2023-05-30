package Abstract_classes;

import Hero_classes.Warrior;
import Interface.Attack;
import Interface.Die;
import Interface.Get_damage;

public abstract class Hero implements Attack, Get_damage, Die
{
    protected String name;
    protected Integer hp = 500;
    protected Integer damage = 30;
    protected Integer armor = 15;


    public Hero(String name) {
        this.name = name;
    }

    public Integer getHp() {
        return hp;
    }

    public Integer getArmor() {
        return armor;
    }

    public Integer getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

}
