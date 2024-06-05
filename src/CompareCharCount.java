import java.util.Arrays;

public class CompareCharCount {

    static boolean  checkCharCount(String str1,String str2){

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();


        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        System.out.println(charArray1);
        System.out.println(charArray2);

        return  Arrays.equals(charArray1,charArray2);
    }

    public static void main(String[] args) {

        String str1= "praaa";
        String str2 = "sraaa";

        boolean result = checkCharCount(str1,str2);

        System.out.println("Both String have same char count : "+result);

    }
}
