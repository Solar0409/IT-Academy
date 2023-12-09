public class EmailValidator implements Validator {
    @Override
    public boolean validate(String input) {
        // Implement validation logic for email addresses
        return input.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
    }
}