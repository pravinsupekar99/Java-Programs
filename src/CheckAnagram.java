import java.util.Arrays;

public class CheckAnagram {
    public static void main(String[] args) {

        String input1="listen";
        String input2="silent";
        // Check if two strings are anagrams of each other
        char[] charArray1 = input1.toCharArray();
        char[] charArray2 = input2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        System.out.println(charArray1);
        System.out.println(charArray2);

        if (Arrays.equals(charArray1, charArray2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }

    }
}
