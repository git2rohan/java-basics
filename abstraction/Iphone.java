package abstraction;

public class Iphone extends Phone{
    //IPhone extends an abstract class, 
    //suppose if iphone fails to define any of the abstract method then iPhone will also become an abstract class

    //THe class which defines all the abstract methods is called as Concret class
    
    @Override
    void videoCalling() {
        System.out.println("VC feature is available now..");
        
    }
}
