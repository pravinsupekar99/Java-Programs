import java.util.Arrays;

public class CheckTwoArrayEquals {
    public static void main(String[] args) {

        int[] arr1 = {1,2,5,8,9,7};
        int[] arr2 = {5,8,9,1,2,7};

        if (checkArrEquals(arr1,arr2))
            System.out.println("Both Array are equals");
        else
            System.out.println("Both Array are not equals");
    }

    public  static boolean checkArrEquals(int[]arr1,int[] arr2)
    {
        if(arr1.length!=arr2.length)
        {
            return false;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);



        for (int i = 0 ; i< arr1.length; i++) {

            if (arr1[i]!=arr2[i]) {
                return false;
            }
        }

        return true;
    }
}
