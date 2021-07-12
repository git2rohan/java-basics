package abstraction;

public class Main {
    
    public static void main(String[] args) {
        RepairShop repairMaster = new RepairShop();
        //Note - You cannot instantiate abstract class, object cannot be created
        Phone Iphone = new Iphone();
        Phone Samsung = new Samsung();
    
        repairMaster.repair(Iphone);
        repairMaster.repair(Samsung);
    }
    
    
    
}
