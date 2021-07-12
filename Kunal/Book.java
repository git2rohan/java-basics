import java.util.Scanner;

class Book{
    private int bookNo;
    private String bookTitle;
    private float price;

    //Write function definition here
    private float TOTAL_COST(int numberOfCopies)
    {
        return numberOfCopies*price;
    }

    //Write function definition here
    public void INPUT(Scanner scanner)
    {
        System.out.print("Enter Book Number: ");
        bookNo = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter title of Books: ");
        //take input and Only consider 1st 20 characters of booktitle string
        bookTitle = scanner.nextLine();
        if(bookTitle.length()>20)
        {
            bookTitle.substring(0, 20);
        }
        System.out.print("Enter price of 1 copy of Book: ");
        price = Integer.parseInt(scanner.nextLine());
    }

    //Write function definition here
    public void PURCHASE(Scanner scanner)
    {
        System.out.print("Number of copies to be purchased : ");
        int numberOfCopies = Integer.parseInt(scanner.nextLine());

        System.out.println("Book Number : "+bookNo);
        System.out.println("Book Title  : "+bookTitle);
        System.out.println("Book Price  : "+price);
        System.out.println("Total cost to be payed : "+ TOTAL_COST(numberOfCopies));
    }

    public static void main(String args[])
    {
        //Create scanner object
        Scanner scanner = new Scanner(System.in);

        //Instantiate book class
        Book book = new Book();
        //Call input, purchase and pass scanner object
        book.INPUT(scanner);
        book.PURCHASE(scanner);

        scanner.close();
    }
}