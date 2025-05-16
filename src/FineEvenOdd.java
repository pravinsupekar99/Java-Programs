import java.util.Arrays;

public class FineEvenOdd {
    public static void main(String[] args) {

        // Find the even and odd numbers in a list of integers.
        // Example: [1, 2, 3, 4, 5] -> Even: [2, 4], Odd: [1, 3, 5]
        // Using Java Streams
        // Using Collections
        // Using Java 8

        int[] numbers = {1, 2, 3, 4, 5};

        // Using Java Streams
        int[] evenNumbers = Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .toArray();

        int[] oddNumbers = Arrays.stream(numbers)
                .filter(n -> n % 2 != 0)
                .toArray();

        System.out.println("Even Numbers: " + Arrays.toString(evenNumbers));
        System.out.println("Odd Numbers: " + Arrays.toString(oddNumbers));


    }
}
