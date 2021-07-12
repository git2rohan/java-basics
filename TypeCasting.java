public class TypeCasting {

    public static void main(String[] args) {
        //Force a float data to store into int variable so that decimal values will be truncated
        //This is explicit Typecasting, Dev has to say that please convert this data into int from float
        int var1 = 3;
        var1 = (int)5.2;
        System.out.println(var1); //5

        //Store a int variable into float variable
        //This is implicit typecasting, Automatically that int data will be treated as float data.
        float var2 = 7.1f;
        var2 = var1;
        System.out.println(var2); //5.0
        
    }
    
}
