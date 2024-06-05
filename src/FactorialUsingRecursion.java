public class FactorialUsingRecursion {
    public static void main(String[] args) {

        int num = 5;
        int fact = factorial(num);
        System.out.println("Factorial of "+num+" is "+fact);
    }

    public static int factorial(int num)
    {
        if(num<0)
        {
            throw  new IllegalArgumentException("NUMBER MUST BE NON-NEGATIVE");
        }
        if(num == 1 || num == 0)
        {
            return 1;
        }

        return  num * (factorial( num - 1));
    }
}
