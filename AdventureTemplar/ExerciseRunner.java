public class ExerciseRunner {

    public static void main(String[] args) {
        Templar alistair = new Templar("Dumbledore", 30, 8, 4);
        Templar roderick = new Templar("Ron Weasley", 10, 1, 2);

        Character.fight(alistair, roderick);

        alistair.heal(alistair);

        System.out.println(Character.printStatus());
    }
}