package systemdesign.solid.srp;



public class CorrectCode {

    static class Baker{
        void bakeBread(){
            System.out.println("Baking bread");
        }
    }

    static class InventoryManager{
        void manageInventory() {
            System.out.println("Managing inventory");
        }
    }

    static class OrderSupplyManager{
        void orderSupplies() {
            System.out.println("Ordering supplies");
        }
    }

    static class CustomerServiceHandler{
        void handleCustomerService() {
            System.out.println("Handling customer service");
        }
    }

    static class BakeryCleaner{
        void cleanBakery() {
            System.out.println("Cleaning bakery");
        }
    }

    public static void main(String[] args) {
        Baker b = new Baker();
        b.bakeBread();

        InventoryManager im = new InventoryManager();
        im.manageInventory();

        OrderSupplyManager osm = new OrderSupplyManager();
        osm.orderSupplies();

        CustomerServiceHandler csh = new CustomerServiceHandler();
        csh.handleCustomerService();

        BakeryCleaner bc = new BakeryCleaner();
        bc.cleanBakery();
    }

    //Each class has a single responsibility, hence adhering to SRP leading to focused responsibility, hence correct code
}
