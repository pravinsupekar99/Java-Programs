import org.w3c.dom.stylesheets.LinkStyle;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindSecondHighest {
    public static void main(String[] args) {
        // Second-Highest Salary in a List
        // Given a list of salaries, find the second-highest salary.
        // Example: [10000, 50000, 20000, 60000, 70000, 90000] -> 80000
        // If there is no second-highest salary, print "No Salary Found!"

        // Using Java Streams
        // The list contains duplicate values
        // The list does not contain duplicate values

        // Using Java Streams
        // Using Collections
        // Using Java 8
        List<Integer> salaries = Arrays.asList(10000,50000,20000,60000,70000,90000);

        Optional<Integer> secondHighest = salaries.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        secondHighest.ifPresentOrElse(salary -> System.out.println( "Second Highest Salary is :"+salary),
                ()-> System.out.println("No Salary Found!"));

    }
}
