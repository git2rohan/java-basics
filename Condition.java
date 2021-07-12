public class Condition {
    public static void main(String[] args) {

        int input = Integer.parseInt(args[0]);//If you pass any Float number then it will throw NumberFormatException
        
        //Check whether number is even / odd ?

        if(input%2==0)
        {
            System.out.println("Input is even number");
        }
        else if(input==0)
        {
            System.out.println("Your number is zero");
        }
        else
        {
            System.out.println("Input is odd number");
        }

    }
}
