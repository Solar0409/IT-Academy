class AmericanPhoneValidator implements Validator {
    @Override
    public boolean validate(String input) {
        // Implement validation logic for American phone numbers
        return input.matches("\\+1\\d{10}");
    }
}