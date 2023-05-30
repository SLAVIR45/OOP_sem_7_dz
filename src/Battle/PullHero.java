package Battle;

import Abstract_classes.Hero;

import java.util.ArrayList;

public class PullHero {
    private ArrayList<Hero> pullHero ;

    public PullHero(ArrayList<Hero> pullHero) {
        this.pullHero = pullHero;
    }

    public void addHero(Hero name)
    {
        this.pullHero.add(name);
    }

    public void deleteHero (Integer id)
    {
        this.pullHero.remove(id);

    }

    public void showPullHero()
    {
        for (Hero value : this.pullHero)
        {
            System.out.println(value.getName());
        }
    }

    public Hero giveHero_id(int value)
    {
        return pullHero.get(value);
    }




}

