import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int initialValue = scan.nextInt();
        System.out.print("Run Loop till : ");
        int range = scan.nextInt();
      
        System.out.println("Which loop do you want to run ? 1.While Loop, 2.For Loop, 3.Do While Loop");
        int loop = scan.nextInt();

        if(loop==1)
        {
            System.out.println("Run while loop => ");
            WhileLoop(initialValue, range);
        }
        else if(loop == 2)
        {
            System.out.println("Run for loop => ");
            forLoop(initialValue, range);
        }
        else{
            System.out.println("Run do while loop => ");
            doWhileLoop(initialValue, range);
        }

        scan.close();
    }
    
    static void WhileLoop(int initialValue, int range)
    {
        while(initialValue <= range)
        {
            System.out.println(initialValue);
            initialValue++;

            //Break if initial value == range [ this does not needed here because while loop has condition itself]
            if(initialValue == range) break; 
        }

    }

    static void forLoop(int initialValue, int range)
    {
        for(int i = initialValue; i <= range; i++)
        {
            System.out.println(i);

            //Break if initial value == range [ this does not needed here because for loop has condition itself]
            if(i == range) break; 
        }
    }

    static void doWhileLoop(int initialValue, int range)
    {
        //do statement executes 1st regardless the condition mentioned inside while loop
        do{
            System.out.println(initialValue);
            initialValue++;
        }
        while(initialValue <= range);
    }
}
