package systemdesign.solid.srp;

public class IncorrectCode {

    static class Baker{
        void bakeBread(){
            System.out.println("Baking bread");
        }

        void manageInventory(){
            System.out.println("Managing inventory");
        }

        void orderSupplies(){
            System.out.println("Ordering supplies");
        }

        void handleCustomerService(){
            System.out.println("Handling customer service");
        }

        void cleanBakery(){
            System.out.println("Cleaning bakery");
        }
    }

    public static void main(String[] args) {
        Baker b = new Baker();
        b.bakeBread();
        b.manageInventory();
        b.orderSupplies();
        b.handleCustomerService();
        b.cleanBakery();
    }

    //Mutliple responsisbilties in single class breaks SRP leading to shift of focused responsibility, hence incorrect code
}
