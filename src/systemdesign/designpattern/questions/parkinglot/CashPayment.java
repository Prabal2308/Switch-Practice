package systemdesign.designpattern.questions.parkinglot;

public class CashPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing cash payment of amount: $" + amount);
        // Additional logic for handling cash payment can be added here
    }
}
