public class Templar extends Character implements Healer , Tank {
  private  final int healCapacity ;
   private final int shield ;

    public Templar(String name,int maxHealth,int healCapacity, int shield){
        super(name, maxHealth);
        this.shield = shield;
        this.healCapacity = healCapacity;
    }
    public int getHealCapacity(){
        return healCapacity;
    }
     public int getShield(){
        return shield;
    }
    public void heal(Character c){
        int current = c.getCurrentHealth() + healCapacity;

        if (current > c.getMaxHealth()) {
            c.setCurrentHealth(c.getMaxHealth());
        } else {
            c.setCurrentHealth(current);
        }
    }
    @Override
    public String toString() {
        if (getCurrentHealth() <= 0){
        // return getName() + " has been beaten, even with its "+ shield + " shield. So bad, it could heal " + healCapacity + " HP and has a shield of "+shield  ;
        return getName() +" has been beaten, even with its " + shield + " shield. So bad, it could heal " + healCapacity +" HP.";
        }
        // return getName() + " is a strong Templar with " + getCurrentHealth() + " HP. It can heal " + this.healCapacity + " HP.";
        return getName() + "is a strong Templar with " + getCurrentHealth()+" HP. It can heal " + healCapacity + " HP and has a shield of " + shield + " .";
    }

}

