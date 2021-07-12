package inheritance.Single;

public class Product {

    //This is a parent / super class
    
    //Why below methods are private ? => So that outside entities does not directly interact with these properties. Instead they have to call the methods
    private String productId;
    private String productName;
    private String productPrice;

    //Get and Set properties methods
    public String getProductId() {
        return productId;
    }
    public void setProductId(String productId) {
        this.productId = productId;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getProductPrice() {
        return productPrice;
    }
    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }


    public void setProductProperties(String pId, String pName, String pPrice)
    {
        this.productId=pId;
        this.productName=pName;
        this.productPrice=pPrice;
    }

    public void showProductDetails()
    {
        System.out.println("------------");
        System.out.println("Product ID - "+this.productId);
        System.out.println("Product Name - "+this.productName);
        System.out.println("Product Price - "+this.productPrice);
    }

    public Product() {
        System.out.println("Product object instantiated");
    }
    
    
    
}
