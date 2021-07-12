package accessmodifier.com.DifferentPackage;

import accessmodifier.com.AccessModifier.AccessModifier;

//Now let's inherit AccessModifier class with a new class and then try to access protected method by child object
//Parent object can't access protected properties/methods using own object

class ChildClass extends AccessModifier
{
    private final String CHILD_NAME = "Child";

    //Now let's inherit AccessModifier class with a new class and then try to access protected method

    public static void main(String[] args) {
        ChildClass child = new ChildClass();

        //Child class's object can access protected method of parent class ( but inside the child class only)
        System.out.println(child.protectedMethod());

    }
}