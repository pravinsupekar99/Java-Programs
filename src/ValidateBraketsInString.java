import java.util.Stack;

public class ValidateBraketsInString {
    public static void main(String[] args) {
        String str = "[()]{}";
        //String str = "[)";


        boolean result = validateBrakets(str);
        System.out.println(str);
        System.out.println(result);
    }

    private static boolean validateBrakets(String str) {

        Stack<Character> stack = new Stack<>();

        for (int i =0 ; i < str.length();i++)
        {
            char ch = str.charAt(i);

            if(ch=='}')
            {
                if(stack.peek()=='{')
                {
                    stack.pop();
                }
                else
                {
                    return false;
                }
            }else if (ch==']')
            {
                if(stack.peek()=='[')
                {
                    stack.pop();
                }
                else
                {
                    return false;
                }

            } else if (ch == ')') {

                if(stack.peek()=='(')
                {
                    stack.pop();
                }
                else
                {
                    return false;
                }
            }
            else
            {
                stack.push(ch);
            }

        }

        if(stack.size() == 0)
        {
            return true;
        }
        return false;
    }


}

