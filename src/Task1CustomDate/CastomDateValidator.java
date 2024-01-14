package Task1CustomDate;

public class CastomDateValidator implements Validator {
    public static void main(String[] args) {

    }

    @Override
    public boolean validate(String input) {
        if (input.matches("[dd-mm-yyyy ]")) return true;
        else return false;
    }
}
