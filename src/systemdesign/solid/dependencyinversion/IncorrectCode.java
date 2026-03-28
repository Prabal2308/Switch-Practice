package systemdesign.solid.dependencyinversion;
//says class should depend on abstractions not on concretions
//High-level modules should not depend on low-level modules. Both should depend on abstractions.
public class IncorrectCode {
    private final EmailNotification emailNotification;

    static class EmailNotification {
        void sendEmail(String message) {
            System.out.println("Sending email: " + message);
        }
    }

    IncorrectCode(EmailNotification emailNotification) {
        this.emailNotification = emailNotification;
    }

    void processOrder(String orderDetails) {
        // Process the order
        System.out.println("Processing order: " + orderDetails);
        // Notify via email
        emailNotification.sendEmail("Order processed: " + orderDetails);
    }

    public static void main(String[] args) {
        EmailNotification emailNotification = new EmailNotification();
        IncorrectCode orderProcessor = new IncorrectCode(emailNotification);
        orderProcessor.processOrder("Order#12345");
    }
    //now lets say I want to send whatapp notification instead of email notification, I need to modify the existing code of IncorrectCode class which violates DIP, hence incorrect code
}
