import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class IntegerList {
    public static void main(String[] args) {

        List<Integer> numberList = Arrays.asList(1,3,5,9,2,7,8,6);

        //EVEN NUMBER
        List<Integer> evenList =  numberList.stream().filter(n-> n%2 ==0).collect(Collectors.toList());
        System.out.println("Even No :"+evenList);
        evenList.forEach(n->System.out.print(n+","));
        // ODD NUMBERS
        System.out.println("");
        List<Integer> oddList = numberList.stream().filter(n -> n%2 !=0).toList();
        System.out.println("Odd No : "+oddList);

        // MAX NUMBER USING OPTIONAL
        Optional<Integer> maxNumber = numberList.stream().max(Integer::compareTo);
        System.out.println("Max No : "+maxNumber.get());

        // MIN NUMBER USING OPTIONAL

        Optional<Integer> minNumber = numberList.stream().min(Integer::compareTo);
        System.out.println("Min No : "+ minNumber.get());

        //Max No Without Optional
        Integer maxNum = numberList.stream().max(Comparator.naturalOrder()).get();
        System.out.println("Max No Without Optional : "+maxNum);

        // Min No Without Optional
        Integer minNum = numberList.stream().min(Comparator.naturalOrder()).get();
        System.out.println("Min No Without Optional : " + minNum);

        long fact = LongStream.range(1,maxNum).reduce(1,(a,b) -> a * b);
        System.out.println("Factorial of Max No: " + minNum);

    }
}
