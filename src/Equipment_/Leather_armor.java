package Equipment_;

import Abstract_classes.Equipment;

public class Leather_armor extends Equipment
{
    private Integer agility;

    public Leather_armor(String name, Integer armor, Integer agility) {
        super(name, armor);
        this.agility = agility;
    }

    public Integer getAgility()
    {
        return this.agility;
    }
}
