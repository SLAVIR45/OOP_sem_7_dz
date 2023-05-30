package Abstract_classes;

public abstract class Equipment
{
    protected String name;
    protected Integer armor;

    public Equipment(String name, Integer armor) {
        this.name = name;
        this.armor = armor;
    }

    public String getName() {
        return name;
    }

    public Integer getArmor() {
        return armor;
    }
}
