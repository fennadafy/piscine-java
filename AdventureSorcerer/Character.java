import java.util.ArrayList;
import java.util.List;

public class Character {
    private final int maxHealth;
    public int currentHealth;
    private final String name;
    private static List<Character> allCharacters = new ArrayList<>();

    public Character(String name , int maxHealth) {
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        this.name = name;
        this.allCharacters.add(this);
    }

    public static String printStatus(){
        if (allCharacters.size() == 0){
            return "------------------------------------------\nNobody's fighting right now !\n------------------------------------------\n" ;
        }
        String res = "------------------------------------------\nCharacters currently fighting :\n";
        for (Character character : allCharacters){
            res += " - " ;
            res += character.toString();
            res += "\n";
        }
        return res + "------------------------------------------\n";
    }

    public static Character fight(Character c1, Character c2){
        while (c1.currentHealth >0 && c2.currentHealth>0){
            c1.attack(c2); 
                if (c2.currentHealth <=0){
                    return c1;
                }
            c2.attack(c1);
        }
        if (c1.currentHealth <=0) {
            return c2;
        }
            return c1;
    }

    public int getMaxHealth(){
        return this.maxHealth;
    }

    public int getCurrentHealth() {
        return this.currentHealth;
    }
    public void setCurrentHealth(int CurrentHealth){
        this.currentHealth += CurrentHealth;
    }
    public String getName(){
       return this.name;
    }

    public String toString(){
        if (currentHealth <= 0 ){
            return name + " : KO";
        }
        return name + " : "+currentHealth + "/"+ maxHealth;
    }

    public void attack(Character character){
       character.takeDamage(9);
    }

    public void takeDamage(int amount){
        if (currentHealth - amount>0){
        this.currentHealth = currentHealth - amount;
        }else{
        this.currentHealth = 0;

        }
    }
}