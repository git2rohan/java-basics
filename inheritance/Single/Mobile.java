package inheritance.Single;

public class Mobile extends Product{

    private String OS;
    private String brand;
    private String os_version;

    public String getOS() {
        return OS;
    }

    public void setOS(String oS) {
        OS = oS;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOs_version() {
        return os_version;
    }

    public void setOs_version(String os_version) {
        this.os_version = os_version;
    }

    public Mobile()
    {
        System.out.println("Mobile object instantiated");
    }
    
    //let's overload set properties method

    public void setProductProperties(String pId, String pName, String pPrice, String os, String os_vString, String brand)
    {
        this.setProductId(pId);
        this.setProductName(pName);
        this.setProductPrice(pPrice);
        this.setBrand(brand);
        this.setOS(os);
        this.setOs_version(os_vString);
        
    }
    
    //Now let's override show product details method

    @Override
    public void showProductDetails() {
        System.out.println("------------");
        System.out.println("Product ID - "+getProductId());
        System.out.println("Product Name - "+getProductName());
        System.out.println("Product Price - "+getProductPrice());
        System.out.println("Brand Name - "+getBrand());
        System.out.println("OS Name - "+getOS());
        System.out.println("OS Version Name - "+getOs_version());
    }
}
