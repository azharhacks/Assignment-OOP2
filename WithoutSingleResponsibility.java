public class WithoutSingleResponsibility {
    public void createUser(String name) {
        System.out.println("User " + name + " created.");
    }

    public void saveToDatabase(String name) {
        System.out.println("User " + name + " saved to DB.");
    }

    public void sendEmail(String name) {
        System.out.println("Email sent to " + name);
    }
}
