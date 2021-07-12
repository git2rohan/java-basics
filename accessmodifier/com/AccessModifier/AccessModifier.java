package accessmodifier.com.AccessModifier;

public class AccessModifier {

    //Access modifiers defines where the properties/methods can be accessed ?

    //Public => Access Available outside package / same program
    //Default => Access Available to whole package
    //Private => Access only inside the block
    //Protected => Within the package and outside package only when class inherited
    
    public static void main(String[] args) {

        AccessModifier object = new AccessModifier();

        //Access private method inside same class / same block
        System.out.println(object.privateMethod());

        //Public and Default methods can be called out inside this class and inside whole package
    }

    private String privateMethod()
    {
        return "This is private method";
    }
    
    protected String protectedMethod()
    {
        return "This is protected method";
    }
    
    public String publicMethod()
    {
        return "This is public method";
    }

    String defaultMethod()
    {
        return "This is default method";
    }

}
