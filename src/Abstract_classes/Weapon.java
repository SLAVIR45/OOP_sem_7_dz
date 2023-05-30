package Abstract_classes;

public abstract class Weapon
{
    protected String name;
    protected Integer damage;

    public Weapon(String name, Integer damage) {
        this.name = name;
        this.damage = damage;
    }

    public Integer getDamage() {
        return damage;
    }
}
