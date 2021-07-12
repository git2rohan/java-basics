public class Constuctor {
    public static void main(String[] args) {
        //Can be called default as well
        Bike bike = new Bike();

        System.out.println(bike.modelName);

        Bike heroBike = new Bike("Hero"); //this will call overloaded parameterized constructor of bike class

        System.out.println(heroBike.modelName);

        //Just by instantiation of the Bike class constructor will be called.
    }
}

class Bike
{
    //Only Public, Protected and Private access modifiers are valid ( Default is already )
    //If used private constructor - Class cannot be instantiated, object cannot be created outside class
    //We cannot make a static constructor
    //Constructors can be overrided

    public String modelName;

    //Constructor used for properties instantiation / setup
    Bike()
    {
        //This keyword used to access property of the same class
        this.modelName = "Unicorn, Honda";
        //Bike.modelName

        //This is bike class constructor
        System.out.println("Bike class constructor is called.. !");
    }

    Bike(String ModelName)
    {
        this.modelName = ModelName;
    }

}
