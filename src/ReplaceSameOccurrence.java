import java.util.stream.Collectors;

public class ReplaceSameOccurrence {
    public static void main(String[] args) {

        String str = "CloudTeCh";

        replaceSameOccurrence(str,'C');
    }

    public static void replaceSameOccurrence(String str , char c) {

        String finalStr = "";

        if (str != null)
        {
            finalStr = str.chars().filter(ch->ch!=c).mapToObj(ch->String.valueOf((char)ch)).collect(Collectors.joining());
            System.out.println("Using Java 8 features: "+ finalStr);

            finalStr = "";
            for (char ch : str.toCharArray()) {
                if (ch!=c)
                {
                    finalStr +=  ch;
                }
            }
        }

        System.out.println(finalStr);
    }

}
