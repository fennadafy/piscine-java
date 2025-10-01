public class Character {
    private final int maxHealth;
    private int currentHealth;
    private final String name;
    
   public Character(String name , int maxHealth){
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        this.name = name;
    }
    public int getMaxHealth(){
        return this.maxHealth;
    }
    public int getCurrentHealth() {
        return this.currentHealth;
    }
    public String getName(){
       return this.name;
    }
  
 
    // @Override
    public String toString(){
        if (currentHealth <= 0 ){
            // return String.format("% : KO", name);
            return name + " : KO";
        }
        // return String.format("% : %/%", name, currentHealth, maxHealth);
        return name + " : "+currentHealth + "/"+ maxHealth;
    }

    public void attack(Character character){
       character.takeDamage(9);
    }

    public void takeDamage(int amount){
        this.currentHealth = currentHealth - amount;
    }
}