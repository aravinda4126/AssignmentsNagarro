import java.util.Scanner;
import java.util.Stack;

public class Assignment1 {

    // create method isValidParentheses() to check whether the input string is valid or not
    public static boolean isValidParentheses(String inputString) {

        //Constraint 1. length of input string should be between (1, 10000)
        if(inputString.length() > 10000){
            return false;
        }

        // create an empty stack
        Stack<Character> stack = new Stack<>();

        // iterate through inputString
        for (int i = 0; i < inputString.length(); i++) {

            // get current character (ith character) as checkChar
            char checkChar = inputString.charAt(i);

            //check whether checkChar is '(', '[' or '{'
            if (checkChar == '{' || checkChar == '[' || checkChar == '(') {
                // push checkChar to stack
                stack.push(checkChar);
                continue;
            }
            // if stack is empty, return false
            if (stack.isEmpty()) {
                return false;
            }

            // use switch statement to check pop element from stack.
            // if it is not equal to relevant open parentheses, return false
            char popChar;

            switch (checkChar) {
                case ')':
                    popChar = stack.pop();
                    if (popChar != '(')
                        return false;
                    break;
                case '}':
                    popChar = stack.pop();
                    if (popChar != '{')
                        return false;
                    break;
                case ']':
                    popChar = stack.pop();
                    if (popChar != '[')
                        return false;
                    break;
            }
        }
        return (stack.isEmpty());
    }

    public static void main(String[] args) {

        // create an instance of Scanner class
        Scanner sc = new Scanner(System.in);

        System.out.print("s = ");
        // take input string (checkStr) from user to validate
        String checkStr = sc.nextLine();

        // call isValidParentheses() method to check whether input string is valid or not
        boolean isValid = isValidParentheses(checkStr);
        System.out.println(isValid);
    }
}