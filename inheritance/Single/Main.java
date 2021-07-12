package inheritance.Single;

public class Main {

    public static void main(String[] args) {
        
        Mobile mobile = new Mobile();

        //Can call overloaded / parent orginal method
        mobile.setProductProperties("Mobile_1", "Redmi Note 8", "8000", "Android","a10", "Redmi" );

        //Only overrided method can be called
        mobile.showProductDetails();
    }
    
}
