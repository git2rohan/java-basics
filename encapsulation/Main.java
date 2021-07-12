package encapsulation;

public class Main {

    public static void main(String[] args) {
        
        Account account = new Account();
        account.setAccountType("Salary");
        account.setUserName("Rohan");

        System.out.println(account.getBalance());
        System.out.println(account.getUserName());
    }
    
}
