package datastructure;

public class ArrayDescribe {
    public static void main(String[] args) {
        
        //This is a int variable holding an int value inside a single memory location
        int x = 1;
        //But how to store multiple integer values inside a single variable name ?

        //Here we can use Array - 

        //We can store multiple values in continuous memory locations
        //Array will store these values into a sequence in memory
        //We can fetch array values by index numbers
        int rollNumberofStudents[] = {1,2,3,4,5};
        
        //Fetch 2nd element of array -
        System.out.println("2nd element - "+rollNumberofStudents[1]);

        //Index number starts with 0
        //Means 3rd element of the array will have index number 2
    }
}
