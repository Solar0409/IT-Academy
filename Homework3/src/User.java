
import java.text.ParseException;
        import java.text.SimpleDateFormat;
        import java.util.Date;


public class User {
    private Date dateOfBirth;
    private String phone;
    private String email;

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User() {
        // Set the default date of birth to today
        this.dateOfBirth = new Date();
    }

    // Setter method for dateOfBirth with validation
    public void setDateOfBirth(String dateOfBirthStr) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.dateOfBirth = dateFormat.parse(dateOfBirthStr);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please use dd/MM/yyyy.");
        }
    }

    // Setter method for phone with validation using BelarusPhoneValidator
    public void setPhone(String phone) {
        Validator belarusPhoneValidator = new BelarusPhoneValidator();
        if (belarusPhoneValidator.validate(phone)) {
            this.phone = phone;
        } else {
            System.out.println("Invalid Belarusian phone number.");
        }
    }
}