
import java.util.ArrayList;
import java.util.List;

public abstract class Character {

    private final int maxHealth;
    private int currentHealth;
    private final String name;
    private static List<Character> allCharacters = new ArrayList<>();
    private Weapon weapon;

    public Character(String name, int maxHealth,   Weapon weapon) {
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        this.name = name;
        this.weapon = weapon;
        this.allCharacters.add(this);
    }
    public Weapon getWeapon() {
            return weapon;
    }
  
    public static String printStatus() {
        if (allCharacters.size() == 0) {
            return "------------------------------------------\nNobody's fighting right now !\n------------------------------------------\n";
        }
        String res = "------------------------------------------\nCharacters currently fighting :\n";
        for (Character character : allCharacters) {
            res += " - ";
            res += character.toString();
            res += "\n";
        }
        return res + "------------------------------------------\n";
    }

    public static Character fight(Character c1, Character c2) {
        while (c1.currentHealth > 0 && c2.currentHealth > 0) {
            c1.attack(c2);
            if (c2.currentHealth <= 0) {
                return c1;
            }
            c2.attack(c1);
        }
        if (c1.currentHealth <= 0) {
            return c2;
        }
        return c1;
    }

    public int getMaxHealth() {
        return this.maxHealth;
    }

    public int getCurrentHealth() {
        return this.currentHealth;
    }

    protected void setCurrentHealth(int CurrentHealth) {
        this.currentHealth = CurrentHealth;
    }

    public String getName() {
        return this.name;
    }
  
    public String toString() {
        if (currentHealth <= 0) {
            return name + " : KO";
        }
        return name + " : " + currentHealth + "/" + maxHealth;
    }
        public abstract String getType();

    public abstract void attack(Character character);

    public abstract void takeDamage(int amount);
}