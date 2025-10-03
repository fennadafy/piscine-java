import java.util.List;

public class ExerciseRunner {
    public static void main(String[] args) {
        System.out.println(ListEquals.areListsEqual(List.of(), List.of()));
        System.out.println(ListEquals.areListsEqual(List.of(), List.of("Alice", "Bob", "Emily", "Charly")));
    }
}