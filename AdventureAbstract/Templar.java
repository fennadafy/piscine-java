
public class Templar extends Character implements Healer, Tank {

    private final int healCapacity;
    private final int shield;

    public Templar(String name, int maxHealth, int healCapacity, int shield) {
        super(name, maxHealth);
        this.shield = shield;
        this.healCapacity = healCapacity;
    }

    public int getHealCapacity() {
        return healCapacity;
    }

    public int getShield() {
        return shield;
    }

    public void heal(Character c) {
        System.out.println(c.getCurrentHealth());
        int current = c.getCurrentHealth() + healCapacity;

        if (current > c.getMaxHealth()) {
            c.setCurrentHealth(c.getMaxHealth());
        } else {
            c.setCurrentHealth(current);
        }
    }

    @Override
    public String toString() {
        if (getCurrentHealth() <= 0) {
            // return getName() + " has been beaten, even with its "+ shield + " shield. So bad, it could heal " + healCapacity + " HP and has a shield of "+shield  ;
            return getName() + " has been beaten, even with its " + shield + " shield. So bad, it could heal " + healCapacity + " HP.";
        }
        // return getName() + " is a strong Templar with " + getCurrentHealth() + " HP. It can heal " + this.healCapacity + " HP.";
        return getName() + " is a strong Templar with " + getCurrentHealth() + " HP. It can heal " + healCapacity + " HP and has a shield of " + shield + ".";
    }

    @Override
    public void attack(Character character) {
        this.heal(this);
        character.takeDamage(6);
    }

    @Override
    public void takeDamage(int damage) {
        int sub_shield = (damage - shield);
        if (super.getCurrentHealth() -  sub_shield<= 0) {
            super.setCurrentHealth(0);
        } else {
            super.setCurrentHealth(super.getCurrentHealth() - sub_shield);
        }
    }
}
