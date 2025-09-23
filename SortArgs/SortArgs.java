
import java.util.Arrays;

public class SortArgs {

    public static void sort(String[] args) {
        Arrays.sort(args);
        for (String c : args) {
            System.out.print(c + " ");
        }
        System.out.print("\n");
    }
}
