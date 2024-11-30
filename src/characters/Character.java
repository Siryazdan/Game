package characters;

public class Character {
    private String name;
    private int health;
    private int strength;

    public Character(String name, int health, int strength) {
        this.setName(name);
        this.setHealth(health);
        this.setStrength(strength);
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

}



