package Hero_classes;
import Abstract_classes.Equipment;
import Abstract_classes.Hero;
import Abstract_classes.Weapon;
import Equipment_.Leather_armor;
import Equipment_.Plate_armor;
import Interface.Attack;
import Interface.Die;
import Interface.Get_damage;
import Weapon_.Blade;
import Weapon_.Bow;

public class Warrior extends Hero implements Attack, Get_damage, Die {
    private Blade weapon;
    private Plate_armor equip;

    public Warrior(String name, Blade weapon, Plate_armor equip) {
        super(name);
        super.damage += 25 + weapon.getDamage();
        super.armor += 5 + equip.getArmor();
        super.hp += equip.getAdditional_hp();
        this.weapon = weapon;
        this.equip = equip;
    }

    @Override
    public void Attack_hero(Hero target) {
        Integer hp = target.getHp() - this.getDamage();
        target.setHp(hp);
    }

    @Override
    public void die() {
        System.out.println("Воин умер");
    }

    @Override
    public void getDamage(int damage) {
        if(this.hp <= 0) die();
        else this.hp -= (int)(damage - this.armor*0.8 );

    }
}


