class Car {

    int mileage, seatingCapacity; //These are attributes of the class (Properties)
    String colour;

    public void run()
    {
        System.out.println("Car started running");
    }

    //All cars has head lights = Static
    public static void headLights()
    {
        System.out.println("Head lights are ready");
    }
    
}

public class MyCar
{
    public static void main(String[] args) 
    {
        Car myCar; //Create an object
        myCar= new Car(); //Allocate Memory
        
        //Calling method ( member method )
        myCar.run();

        //Calling static method without object
        Car.headLights();
        //myCar.headLights(); //Can be called using object but gives warning
    }
}
