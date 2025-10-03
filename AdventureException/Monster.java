
public class Monster extends Character {

    public Monster(String name, int maxHealth, Weapon weapon) {
        super(name, maxHealth, weapon);
    }

    @Override
    public void attack(Character character) {

        if (this.getWeapon() == null) {
           character.takeDamage(7);
        }else {
            character.takeDamage(this.getWeapon().getDamage());
        }
    }
    public String getType() {
        return "monster";
    }
    @Override
    public void takeDamage(int amount) {
        int damages = super.getCurrentHealth()  - (int) Math.floor(amount * 80 / 100);
        if (damages <= 0) {
            super.setCurrentHealth(0);
        } else {
            super.setCurrentHealth(damages);
        }
    }
    @Override
    public String toString() {
        String result;
        if (super.getCurrentHealth() <= 0) {
            return  super.getName() + " is a monster and is dead" ;
        } 
        return  String.format("%s is a monster with %d HP", super.getName(), super.getCurrentHealth());
    }
}