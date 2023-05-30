package Equipment_;

import Abstract_classes.Equipment;

public class Plate_armor extends Equipment
{
    private Integer additional_hp;

    public Plate_armor(String name, Integer armor, Integer additional_hp) {
        super(name, armor);
        this.additional_hp = additional_hp;
    }

    public Integer getAdditional_hp() {
        return additional_hp;
    }
}
