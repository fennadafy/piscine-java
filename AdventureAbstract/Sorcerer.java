
public class Sorcerer extends Character implements Healer {

    private final  int healCapacity;

    public Sorcerer(String name, int maxHealth, int healCapacity) {
        super(name, maxHealth);
        this.healCapacity = healCapacity;
    }

    public void attack(Character character) {
        this.heal(this);
        character.takeDamage(10);
    }

    public void takeDamage(int damage) {
        int current = super.getCurrentHealth();
        if (current - damage <= 0) {
            super.setCurrentHealth(0);
        } else {
            super.setCurrentHealth(current - damage);
        }
    }

    public int getHealCapacity() {
        return this.healCapacity;
    }

    public void heal(Character c) {
        int current = c.getCurrentHealth() + healCapacity;

        if (current > c.getMaxHealth()) {
            c.setCurrentHealth(c.getMaxHealth());
        } else {
            c.setCurrentHealth(current);
        }
    }

    @Override
    public String toString() {
        String result;
        if (super.getCurrentHealth() == 0) {
            result = String.format("%s is a dead sorcerer. So bad, it could heal %d HP.", super.getName(), healCapacity);
        } else {
            result = String.format("%s is a sorcerer with %d HP. It can heal %d HP.", super.getName(), super.getCurrentHealth(), healCapacity);
        }
        return result;
    }

}
