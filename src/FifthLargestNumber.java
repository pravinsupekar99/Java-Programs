import java.util.Arrays;

public class FifthLargestNumber {
    public static void main(String[] args) {

        int[] numArr = {3, 1, 5, 6, 2, 8, 7, 10, 4, 9};

        if(numArr!=null && numArr.length < 5)
        {
            System.out.println("Array must contain at least 5 elements");
            return;
        }

        for (int i=0;i<5;i++)
        {
            for (int j=i+1;j<numArr.length;j++)
            {
                if(numArr[j]>numArr[i])
                {
                    int temp = numArr[i];
                    numArr[i]= numArr[j];
                    numArr[j]=temp;

                }
            }
        }

        int fifthLno = numArr[4];
        System.out.println("5th largest number is : "+fifthLno);

        Arrays.sort(numArr);

        int fiftLargest = numArr[numArr.length-5];

        System.out.println("5th largest number is : "+fiftLargest);
    }
}
