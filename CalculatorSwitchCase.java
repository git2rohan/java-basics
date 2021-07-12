import java.util.Scanner;

public class CalculatorSwitchCase {
    
    public static void main(String[] args) {
        
        //Intialise scanner iniput stream
        Scanner inputScanner = new Scanner(System.in);

        //Take inputs
        System.out.print("Enter Your 1st Digit : ");
        int a = inputScanner.nextInt();
        System.out.print("Enter Your 2nd Digit : ");
        int b = inputScanner.nextInt();
        System.out.print("Enter Operator(+ - * /) : ");
        char o = inputScanner.next().charAt(0);
        
        //close input stream
        inputScanner.close();

        //Evaluate result
        int result = calculate(a, b, o);

        //Print result
        System.out.println("Result is : "+result);
    }

    /* Author : Rohan soudey
    * This method is used to evaluate calculator results based on the operator selected
    */
    public static int calculate(int a, int b, char Operator)
    {
        //As we are using here return statement directly, Thus no need to use break; statement
        switch(Operator)
        {
            default:
                return 0;
            case '+':
                return a+b;
            case '-':
                return a-b;
            case '*':
                return a*b;
            case '/':
                return a/b;
        }
    }
}
