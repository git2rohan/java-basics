package accessmodifier.com.DifferentPackage;

import accessmodifier.com.AccessModifier.AccessModifier;

public class AccessModifier_outsidePackage
{
    public static void main(String[] args) {
        AccessModifier access = new AccessModifier();
        //Public method can be called here outside package
        System.out.println(access.publicMethod());
        //Default, Private, protected methods cannot be called outside package via class object
        
        // System.out.println(access.privateMethod());
        // System.out.println(access.defaultMethod());
        // System.out.println(access.protectedMethod());

         
    }
}
