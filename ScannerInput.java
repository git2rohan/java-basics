import java.util.Scanner;

public class ScannerInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        int input = scan.nextInt();
        scan.close();
        System.out.println("You have entered : "+ input);
    }
    
}
