package Battle;

import Abstract_classes.Hero;

public class Battle
{
    public void battle(Hero attackHero, Hero target) {
        if (attackHero == target) {
            System.out.println("Frendlifier, огонь по своим");
        } else {
            attackHero.Attack_hero(target);
        }
    }





}
