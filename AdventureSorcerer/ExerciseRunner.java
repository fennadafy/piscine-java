public class ExerciseRunner {

    public static void main(String[] args) {
        Sorcerer gandalf = new Sorcerer("Gandalf", 30, 8);
        // Character frodon = new Character("Frodon", 20);
        Sorcerer saroumane = new Sorcerer("saroumane", 20, 1);

        // Character.fight(frodon, saroumane);
        gandalf.attack(saroumane);
        gandalf.heal(saroumane);
        gandalf.heal(saroumane);

        System.out.println(Character.printStatus());
    }
}