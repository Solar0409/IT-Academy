public class BelarusPhoneValidator implements Validator {
    @Override
    public boolean validate(String input) {
        // Implement validation logic for Belarusian phone numbers
        return input.matches("\\+375\\d{9}");
    }
}