package inheritance.Multilevel;

public class Child extends Men{

    @Override
    public void eat() {
        System.out.println("Children can eat");
    }

    @Override
    public void walk() {
        System.out.println("All children can't walk");
    }

  
}
