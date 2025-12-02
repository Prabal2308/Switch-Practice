package systemdesign.designpattern.questions.parkinglot;

public class CreditCardPayment implements PaymentStrategy {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
        // Add actual credit card processing logic here
    }
}
