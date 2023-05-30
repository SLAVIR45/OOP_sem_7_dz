package Hero_classes;

import Abstract_classes.Equipment;
import Abstract_classes.Hero;
import Abstract_classes.Weapon;
import Equipment_.Leather_armor;
import Equipment_.Robe;
import Interface.Attack;
import Interface.Die;
import Interface.Get_damage;
import Weapon_.Bow;
import Weapon_.Staff;

public class Wizard extends Hero implements Attack, Get_damage, Die {

   private Integer mana = 200;
   private Staff weapon;
   private Robe equip;

    public Wizard(String name, Staff weapon, Robe equip) {
        super(name);
        super.damage += 10 + weapon.getDamage();
        this.mana += weapon.getMana() + equip.getMana();
        this.weapon = weapon;
        this.equip = equip;
    }

    @Override
    public void Attack_hero(Hero target) {
        Integer hp = target.getHp() - this.getDamage();
        this.mana -= 20;
        target.setHp(hp);
    }

    @Override
    public void die() {
        System.out.println("Маг умер");

    }

    @Override
    public void getDamage(int damage) {
        if(this.hp <= 0) die();
        else this.hp -= (int)(damage - this.armor*0.8);

    }
}
