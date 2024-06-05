public class SwapTwoNumber {
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 5;

            a = a ^ b;
            b = a ^ b;
            a = a ^ b;
            System.out.println("After Swapping  Using Bitwise XOR Operation  a: " + a + " b: " + b);

            a = a + b;
            b = a - b;
            a = b - a;

            System.out.println("After Swapping using Mathematical a: " + a + " b: " + b);

            int c = a;
            a= b;
            b = c;

            System.out.println("After Swapping using 3rd Variables a: " + a + " b: " + b);



        } catch (IndexOutOfBoundsException ex)
        {

        } catch (ArithmeticException rx)
        {

        }
        finally {
            System.out.println("finally");
        }



    }
}
