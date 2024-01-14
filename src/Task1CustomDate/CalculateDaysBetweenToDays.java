package Task1CustomDate;
import java.time.Month;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CalculateDaysBetweenToDays {
    public static void main(String[] args) {
        LocalDate dateBefore= LocalDate.of (2023,Month.DECEMBER,01);
        LocalDate dateAfter = LocalDate.of(2024,Month.JANUARY,01);
        long daysBetween = ChronoUnit.DAYS.between(dateBefore,dateAfter);
        System.out.println(daysBetween);



    }
}
