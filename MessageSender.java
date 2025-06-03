// Using Dependency Inversion Principle

interface MessageSender {
    void sendMessage(String message, String recipient);
}

class EmailSender implements MessageSender {
    @Override
    public void sendMessage(String message, String recipient) {
        System.out.println("Sending email to " + recipient + ": " + message);
        
    }
}

class SMSSender implements MessageSender {
    @Override
    public void sendMessage(String message, String recipient) {
        System.out.println("Sending SMS to " + recipient + ": " + message);
    }
}


class OrderService {
    private MessageSender messageSender;
    

    public OrderService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }
    
    public void processOrder(String orderId, String customerContact) {
      
        System.out.println("Processing order: " + orderId);
        
        messageSender.sendMessage("Your order " + orderId + " has been processed", customerContact);
    }
}

class Main {
    public static void main(String[] args) {
        MessageSender emailSender = new EmailSender();
        
        OrderService emailOrderService = new OrderService(emailSender);
        emailOrderService.processOrder("12345", "customer@example.com");
        
        MessageSender smsSender = new SMSSender();
        OrderService smsOrderService = new OrderService(smsSender);
        smsOrderService.processOrder("12345", "+1234567890");
    }
}