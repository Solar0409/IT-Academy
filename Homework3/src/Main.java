import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a user
        User user = new User();

        // Set date of birth
        System.out.print("Enter date of birth (dd/MM/yyyy): ");
        user.setDateOfBirth(scanner.next());

        // Set phone number
        System.out.print("Enter phone number: ");
        user.setPhone(scanner.next());

        // Set email address
        System.out.print("Enter email address: ");
        user.setEmail(scanner.next());

        // Display user information
        System.out.println("User Information:");
        System.out.println("Date of Birth: " + user.getDateOfBirth());
        System.out.println("Phone: " + user.getPhone());
        System.out.println("Email: " + user.getEmail());
    }
}