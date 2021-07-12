package inheritance.Multilevel;

public class Race {

    public static void main(String[] args) {
        Child child = new Child();
        child.eat();
        child.walk();
        System.out.println("Children can see - "+child.canSee);
    }
    
}
