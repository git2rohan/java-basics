package accessmodifier.com.AccessModifier;

public class InsidePackage {

    public static void main(String[] args) {
        
        AccessModifier access = new AccessModifier();

        //Default method can be accessed inside same package another class via object of the class
        System.out.println(access.defaultMethod());

        //protected method can be accessed inside same package
        System.out.println(access.protectedMethod());

        //Public can be accessed everywhere
        System.out.println(access.publicMethod());


    }
    
}
