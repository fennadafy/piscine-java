public class Sorcerer extends Character implements Healer {
    private final int healCapacity;

    public Sorcerer(String name,int maxHealth,int healCapacity){
        super(name, maxHealth);
            this.healCapacity = healCapacity;
    }

    public int getHealCapacity(){
        return healCapacity;
    }

    public void heal(Character character) {

        int current = character.getCurrentHealth() +healCapacity ;


        if (current > character.getMaxHealth()) {
            character.setCurrentHealth(character.getMaxHealth());
        } else {
            character.setCurrentHealth(current);
        }

        // System.out.println(character.getMaxHealth());
        // System.out.println(current );
    }

    @Override
    public String toString() {
        if (getCurrentHealth() == 0){
            return getName() + " is a dead sorcerer. So bad, it could heal "+ this.healCapacity + " HP.";
        }
        return getName() + " is a sorcerer with " + getCurrentHealth() + " HP. It can heal " + this.healCapacity + " HP.";
    }
}