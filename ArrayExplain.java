import java.util.Scanner;

class ArrayExplain{
    public static void main(String[] args) {
       
        //basicsOfArray();
        //takeInputFromUserAndFillArray();
        enchancedForLoop();
    }

    static void basicsOfArray()
    {
        String[] bag = {"Yellow", "Blue"}; //Initalization should be on the same line of declaration otherwise intialize object
        //String[] bag = new String[10];

        //Index the above array
        for(int i = 0; i<bag.length; i++)
        {
            System.out.println("Value of the bag at the index "+i+" : "+bag[i]);
        }
    }

    static void takeInputFromUserAndFillArray()
    {
        String[] str;
        Scanner scan = new Scanner(System.in);
        int arrayLength = scan.nextInt();

        str = new String[arrayLength];

        for(int i=0; i<str.length; i++)
        {
            System.out.print("Enter value at index "+i+" : ");
            str[i] = scan.next();
        }

        System.out.println("Here is your final output : ");
        for (String string : str) System.out.print(string+" ");

        scan.close();
    }

    static void enchancedForLoop()
    {
        String days[] = {"Sunday", "Monday", "Tuesday", "Wednesday"};

        for(String day : days)
        {
            System.out.println(day);
        }

    }
}