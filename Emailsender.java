// Not using Dependency Inversion Principle
class EmailSender {
    public void sendEmail(String message, String recipient) {
        System.out.println("Sending email to " + recipient + ": " + message);
        
    }
}


class OrderService {

    private EmailSender emailSender;
    
    public OrderService() {
        
        this.emailSender = new EmailSender();
    }
    
    public void processOrder(String orderId, String customerEmail) {
        
        System.out.println("Processing order: " + orderId);
        
        emailSender.sendEmail("Your order " + orderId + " has been processed", customerEmail);
    }
}


public class Emailsender {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        orderService.processOrder("12345", "customer@example.com");
    }
}