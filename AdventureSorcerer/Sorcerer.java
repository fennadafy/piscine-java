public class Sorcerer extends Character implements Healer {
    private int healCapacity;

    public Sorcerer(String name,int maxHealth,int healCapacity){
        super(name, maxHealth);
            this.healCapacity = healCapacity;
    }

    public int getHealCapacity(){
        return healCapacity;
    }

    public void heal(Character character){
        int current = character.getCurrentHealth();
      

        if (this.getHealCapacity() + current <= character.getMaxHealth()) {
            character.setCurrentHealth(healCapacity + current);
        } else {
            setCurrentHealth(character.getMaxHealth());
        }
   
    }

    @Override
    public String toString() {
        if (getCurrentHealth() == 0){
            return getName() + " is a dead sorcerer. So bad, it could heal "+ this.healCapacity + " HP.";
        }
        return getName() + " is a sorcerer with " + getCurrentHealth() + " HP. It can heal " + this.healCapacity +" HP.";
    }
}