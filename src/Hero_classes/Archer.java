package Hero_classes;

import Abstract_classes.Equipment;
import Abstract_classes.Hero;
import Abstract_classes.Weapon;
import Equipment_.Leather_armor;
import Interface.Attack;
import Interface.Die;
import Interface.Get_damage;
import Weapon_.Bow;

public class Archer extends Hero implements Attack, Get_damage, Die
{
    private Integer agility = 5;
    private Bow weapon;
    private  Leather_armor equip;

    public Archer(String name, Bow weapon, Leather_armor equip) {
        super(name);
        this.agility += equip.getAgility();
        this.weapon = weapon;
        this.equip = equip;
        super.damage += 20 + weapon.getDamage();
    }

    public Integer getAgility() {
        return agility;
    }


    @Override
    public void Attack_hero(Hero target) {
        Integer hp = target.getHp() - this.getDamage();
        target.setHp(hp);
    }

    @Override
    public void getDamage(int damage) {
        if(this.hp <= 0) die();
        else this.hp -= (int)(damage - this.armor*0.8 - this.agility*0.5);

    }

    @Override
    public void die() {
        System.out.println("Умер стрелок");
    }
}
