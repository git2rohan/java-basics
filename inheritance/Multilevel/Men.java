package inheritance.Multilevel;

public class Men extends Human
{
    @Override
    public void eat() {
        System.out.println("Men can eat");
    }   

    @Override
    public void walk() {
        System.out.println("Men can walk");
    }
}
