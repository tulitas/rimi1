import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FindIndex findIndex = new FindIndex();
        List<Integer> array = Arrays.asList(1, 2, 5, 5, 5, 5, 5, 5, 5, 5, 20);
        int key = 5;
        int low = findIndex.findLowIndex(array, key);
        int high = findIndex.findHighIndex(array, key);
        System.out.println("Low Index of " + key + ": " + low);
        System.out.println("High Index of " + key + ": " + high);
    }
}
