public class LogicalOperators {

    public static void main(String[] args) {
        
        //Let's check if your int input are greater than 100 and less than 150 ?

        int input = Integer.parseInt(args[0]);

        if( input > 100 && input < 150 ) //Similarly can use || , !
        {
            System.out.println("input is greater than 100 and less than 150");
        }
        else
        {
            System.out.println("Condition does not met");
        }
    }
}
