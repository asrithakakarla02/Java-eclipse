public class MessagingSystem {
    
    
    static class MessageSender {
        public void sendMessage(String recipient, String message) {
            System.out.println("[Generic] Sending to " + recipient + ": " + message);
        }
    }
    
   
    static class EmailSender extends MessageSender {
        
        public void sendMessage(String recipient, String message) {
            System.out.println("[Email] To: " + recipient);
            System.out.println("Subject: Notification");
            System.out.println("Body: " + message);
            System.out.println("-- Sent via SMTP --\n");
        }
    }
    
    
    static class SMSSender extends MessageSender {
        
        public void sendMessage(String recipient, String message) {
            System.out.println("[SMS] To: " + recipient);
            System.out.println("Message: " + message);
            System.out.println("-- Sent via SMS Gateway --\n");
        }
    }

    public static void main(String[] args) {
        
        MessageSender sender1 = new EmailSender();
        MessageSender sender2 = new SMSSender();
        
        sender1.sendMessage("client@company.com", "Your order has shipped!");
        sender2.sendMessage("+1555123456", "Your package arrives tomorrow");
        
       
        MessageSender genericSender = new MessageSender();
        genericSender.sendMessage("user123", "System notification");
    }
}
