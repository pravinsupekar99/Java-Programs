import java.util.Arrays;
import java.util.List;

public class FindMaxAndMin {
    public static void main(String[] args) {

        //
        // Find the maximum and minimum values in a list of integers.
        // Example: [3, 5, 1, 8, 2] -> Max: 8, Min: 1
        // Using Java Streams
        // Using Collections
        // Using Java 17

        int [] numbers = {3, 5, 1, 8, 2};
        // Using Java Streams
        int max = Arrays.stream(numbers).max().orElseThrow();
        int min = Arrays.stream(numbers).min().orElseThrow();
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        // Using Collections
        List<Integer> numberList = Arrays.asList(3, 5, 1, 8, 2);
        int max1 = numberList.stream().max(Integer::compareTo).orElseThrow();
        int min1 = numberList.stream().min(Integer::compareTo).orElseThrow();
        System.out.println("Max: " + max1);
        System.out.println("Min: " + min1);



    }
}
