package Console;

import Abstract_classes.Hero;
import Battle.Battle;
import Sounds.Sound;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class User_console extends Console{
    Battle battle = new Battle();
    Sound menu = new Sound(new File("./src/Sounds/menu.wav"));
    Sound fight_sound = new Sound(new File("./src/Sounds/OP.wav"));
    Sound fataliti = new Sound(new File("./src/Sounds/fatality.wav"));


    public void Start() throws InterruptedException {
        menu.play(true);
        System.out.println("Выбитеб, что хотите сделать");
        view.show(view.Start_menu());
        Integer value = scaner.valueInt();
        switch (value)
        {
            case 1:
                CreatHero();
                Start();
                break;
            case 2:
                int hero1;
                int hero2;
                System.out.println("Выберите бойцов");
                pullHero.showPullHero();
                System.out.println("Выберите бойца 1");
                hero1 = scaner.valueInt()-1;
                System.out.println("Выберите бойца 2");
                hero2 =scaner.valueInt()-1;
                Fight(hero1,hero2);
                Start();
                break;
        }
    }




    public void Fight (Integer hero1,  Integer hero2) throws InterruptedException {
        Integer rand;
        menu.stop();
        fight_sound.play();
        while (pullHero.giveHero_id(hero1).getHp() >= 0 && pullHero.giveHero_id(hero2).getHp() >=0)
        {
            rand = random.random_1_2();
            if(rand == 1) {
                battle.battle(pullHero.giveHero_id(hero1), pullHero.giveHero_id(hero2));
                System.out.println(pullHero.giveHero_id(hero1).getName() + " Атакует");
                TimeUnit.SECONDS.sleep(1);
            }
            else
                battle.battle(pullHero.giveHero_id(hero2), pullHero.giveHero_id(hero1));
                System.out.println(pullHero.giveHero_id(hero2).getName() + " Атакует");
            System.out.println(pullHero.giveHero_id(hero1).getHp());
            System.out.println(pullHero.giveHero_id(hero2).getHp());
            TimeUnit.SECONDS.sleep(1);

        }
        if (pullHero.giveHero_id(hero1).getHp() > pullHero.giveHero_id(hero2).getHp())
        {
            fight_sound.stop();
            fataliti.play();
            System.out.println("Победил" + pullHero.giveHero_id(hero1).getName());
            TimeUnit.SECONDS.sleep(2);
        }
        else
            fight_sound.stop();
            fataliti.play();
            System.out.println("Победил" + pullHero.giveHero_id(hero2).getName());
            TimeUnit.SECONDS.sleep(2);
    }


    public void Fight (Hero hero1, Hero hero2)
    {
        Integer rand;
        while (hero1.getHp() >= 0 && hero2.getHp() >=0)
        {
            rand = random.random_1_2();
                if(rand == 1) {
                    battle.battle(hero1,hero2);
                    System.out.println(hero1.getName() + " Атакует");
                }
                else
                    battle.battle(hero2, hero1);
                    System.out.println(hero2.getName() + " Атакует");

            System.out.println(hero1.getHp());
            System.out.println(hero2.getHp());

        }
        if (hero1.getHp() > hero2.getHp())
        {
            System.out.println("Победил " + hero1.getName());
        }
        else
            System.out.println("Победил " + hero2.getName());
    }
}
