import Abstract_classes.Hero;
import Battle.PullHero;
import Console.User_console;
import Equipment_.Leather_armor;
import Equipment_.Robe;
import Hero_classes.Archer;
import Hero_classes.Wizard;
import Weapon_.Bow;
import Weapon_.Staff;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main
{
    public static void main(String[] args) throws InterruptedException {


        Archer archer = new Archer("Lik",new Bow("ggg",100),new Leather_armor("aaa",5,5));
        Wizard wizard = new Wizard("Rut",new Staff("222",23,10),new Robe("333",10,20));


        User_console user_console = new User_console();
        user_console.Start();
//        user_console.Fight(archer,wizard); быстрая проверка на файт без музыки







        }
}
