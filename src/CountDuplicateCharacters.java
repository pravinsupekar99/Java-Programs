import java.util.HashMap;
import java.util.Map;

public class CountDuplicateCharacters {
    public static void main(String[] args) {

        // Use Java 17 and Collections

        String input = "Pravin Supekar";
        // Convert the string to a character array
        char[] characters = input.toCharArray();
        // Create a HashMap to store the character counts
        Map<Character, Integer> charCountMap = new HashMap<>();
        // Iterate through the character array
        for (char c : characters) {
            // If the character is already in the map, increment its count
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                // Otherwise, add it to the map with a count of 1
                charCountMap.put(c, 1);
            }
        }

        // Print the duplicate characters
        System.out.println("\nDuplicate characters:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() + "" + entry.getValue());
            }
        }

        // Print the total number of characters
        System.out.println("\nTotal number of characters: " + characters.length);
        // Print the total number of unique characters
    }
}
