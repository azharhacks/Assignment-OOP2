// Handles user creation
class UserCreator {
    public void createUser(String name) {
        System.out.println("User " + name + " created.");
    }
}

// Handles database operations
class UserRepository {
    public void saveToDatabase(String name) {
        System.out.println("User " + name + " saved to DB.");
    }
}

// Handles email sending
class EmailService {
    public void sendEmail(String name) {
        System.out.println("Email sent to " + name);
    }
}

// Combines all responsibilities while delegating to focused classes
public class WithSingleResponsibility {
    private UserCreator creator = new UserCreator();
    private UserRepository repository = new UserRepository();
    private EmailService emailService = new EmailService();

    public void onboardUser(String name) {
        creator.createUser(name);
        repository.saveToDatabase(name);
        emailService.sendEmail(name);
    }
}

