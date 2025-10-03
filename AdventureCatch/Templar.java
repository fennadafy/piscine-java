
public class Templar extends Character implements Healer, Tank {

    private final int healCapacity;
    private final int shield;

    public Templar(String name, int maxHealth, int healCapacity, int shield, Weapon weapon) {
        super(name, maxHealth,weapon);
        this.shield = shield;
        this.healCapacity = healCapacity;
    }

    public int getHealCapacity() {
        return healCapacity;
    }

    public int getShield() {
        return shield;
    }
    
    public void heal(Character c)  throws DeadCharacterException {
          if (this.getCurrentHealth() <= 0) {
            throw new DeadCharacterException(this);
        } 

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
            return getName() + " has been beaten, even with its " + shield + " shield. So bad, it could heal " + healCapacity + " HP.";
        }
        return getName() + " is a strong Templar with " + getCurrentHealth() + " HP. It can heal " + healCapacity + " HP and has a shield of " + shield + ".";
    }

    @Override
    public void attack(Character character)  throws DeadCharacterException{
         if(this.getCurrentHealth() <= 0) {
        throw new DeadCharacterException(this);
        }
       this.heal(this);
        if (this.getWeapon() == null) {
           character.takeDamage(6);
        }else {
            character.takeDamage(this.getWeapon().getDamage());
        }
    }
   public String getType() {
        return "templar";
    }
    @Override
    public void takeDamage(int damage)  throws DeadCharacterException{
         if(this.getCurrentHealth() <= 0) {
        throw new DeadCharacterException(this);
        }
        int sub_shield = (damage - shield);
        if (super.getCurrentHealth() -  sub_shield<= 0) {
            super.setCurrentHealth(0);
        } else {
            super.setCurrentHealth(super.getCurrentHealth() - sub_shield);
        }
    }
}