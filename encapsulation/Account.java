package encapsulation;

public class Account {

    //Below are the properties of the bank account
    //Encapsulate below properties so that outside world would not have direct access.
    private String userName;
    private String address;
    private String balance;
    private String accountType;

    //Now all the properties are private
    //outside world won't be able to access these properties

    //Let's create getter and setter methods to define access

    //UserName will have read and write access
    public String getUserName()
    {
        return this.userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    // Address will have read and write access
    public String getAddress()
    {
        return this.address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    //Balance will have only Read Access
    public String getBalance()
    {
        return this.balance;
    }

    //Account type will only have write access
    public void setAccountType(String accountType)
    {
        this.accountType = accountType;
    }


    
    

}
