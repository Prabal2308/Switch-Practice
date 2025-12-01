package systemdesign.solid.dependencyinversion;

public class CorrectCode {

    private final NotificationService notificationService;

    interface NotificationService {
        void sendNotification(String message);
    }

    static class EmailNotification implements NotificationService {
        @Override
        public void sendNotification(String message) {
            System.out.println("Sending email: " + message);
        }
    }

    static class WhatsAppNotification implements NotificationService {
        @Override
        public void sendNotification(String message) {
            System.out.println("Sending WhatsApp message: " + message);
        }
    }

    static class SMSNotification implements NotificationService {
        @Override
        public void sendNotification(String message) {
            System.out.println("Sending SMS: " + message);
        }
    }

    CorrectCode(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    void processOrder(String orderDetails) {
        // Process the order
        System.out.println("Processing order: " + orderDetails);
        // Notify via the chosen notification service
        notificationService.sendNotification("Order processed: " + orderDetails);
    }

    public static void main(String[] args) {
        NotificationService emailNotification = new EmailNotification();
        CorrectCode orderProcessorEmail = new CorrectCode(emailNotification);
        orderProcessorEmail.processOrder("Order#12345 via Email");

        NotificationService whatsappNotification = new WhatsAppNotification();
        CorrectCode orderProcessorWhatsApp = new CorrectCode(whatsappNotification);
        orderProcessorWhatsApp.processOrder("Order#12345 via WhatsApp");

        NotificationService smsNotification = new SMSNotification();
        CorrectCode orderProcessorSMS = new CorrectCode(smsNotification);
        orderProcessorSMS.processOrder("Order#12345 via SMS");
    }

    // Now, to switch notification methods, we simply inject a different implementation of NotificationService without modifying the existing code of CorrectCode class, adhering to DIP
}
