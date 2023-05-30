package Console;


import Abstract_classes.Hero;
import Battle.PullHero;
import Equipment_.Leather_armor;
import Equipment_.Plate_armor;
import Equipment_.Robe;
import Hero_classes.Archer;
import Hero_classes.Warrior;
import Hero_classes.Wizard;
import Weapon_.Blade;
import Weapon_.Bow;
import Weapon_.Staff;

import java.util.ArrayList;

public class Console

    //***********Доработка*****************
{
    View view = new View();
    Scaner scaner = new Scaner();
    Random random = new Random();
    PullHero pullHero = new PullHero(new ArrayList<Hero>());
    String nameHero;
    String nameWeapon;
    String nameEqip;
    public void CreatHero()
    {
        System.out.println("Какой класс хотите создать");
        view.show(view.HeroClass_mapList());
        Integer value = scaner.valueInt();
        switch (value)
        {
            case 1:
                System.out.println("Введите имя Лучнику");
                nameHero = scaner.valueString();
                System.out.println("Дайте имя луку");
                nameWeapon = scaner.valueString();
                System.out.println("Дайте имя броне");
                nameEqip = scaner.valueString();
                Archer archer = new Archer(nameHero,new Bow(nameWeapon, random.random_1_20()),new Leather_armor(nameEqip, random.random_1_10(), random.random_1_5() ));
                pullHero.addHero(archer);
                break;

            case 2:
                System.out.println("Введите имя Войну");
                nameHero = scaner.valueString();
                System.out.println("Дайте имя мечу");
                nameWeapon = scaner.valueString();
                System.out.println("Дайте имя броне");
                nameEqip = scaner.valueString();
                Warrior warrior = new Warrior(nameHero,new Blade(nameWeapon, random.random_1_20()),new Plate_armor(nameEqip, random.random_1_10(), random.random_1_20()));
                pullHero.addHero(warrior);
                break;
            case  3:
                System.out.println("Введите имя Магу");
                nameHero = scaner.valueString();
                System.out.println("Дайте имя посоху");
                nameWeapon = scaner.valueString();
                System.out.println("Дайте имя броне");
                nameEqip = scaner.valueString();
                Wizard wizard = new Wizard(nameHero,new Staff(nameWeapon, random.random_1_20(), random.random_1_10()),new Robe(nameEqip, random.random_1_10(), random.random_1_20()));
                pullHero.addHero(wizard);
                break;





        }
    }

}
