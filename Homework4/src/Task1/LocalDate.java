package Task1;

//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Objects;

public class LocalDate {


    int year;
    int month;
    int date;

    public LocalDate(int year, int month, int date) {
        this.year = year;
        this.month = month;
        this.date = date;
    }
    public static String getDayStringNew(LocalDate date, Locale locale) {
        DayOfWeek day = date.getDayOfWeek();
        return day.getDisplayName(TextStyle.FULL, locale);
    }

    DayOfWeek getDayOfWeek() {

        return null;
    }

//    public static LocalDate now() {
//        LocalDate date1 = new LocalDate(2023,12,31);
//        return (date1) ;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof LocalDate localDate)) return false;
//        return year == localDate.year && month == localDate.month && date == localDate.date;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(year, month, date);
//    }
//
//    public static LocalDate of(int i) {
//        LocalDate date2 = new LocalDate(2023,12,31);
//        return (date2) ;
//    }
//
//    public void setYear(int year) {
//        this.year = year;
//    }
//
//    public void setMonth(int month) {
//        this.month = month;
//    }
//
//    public void setDate(int date) {
//        this.date = date;
//    }

//    public static void main(String[] args) {
//        LocalDateTime LocalDate = LocalDateTime.parse("June 18, 2019 12:01 AM",
//                DateTimeFormatter.ofPattern("MMMM d',' yyyy hh':'mm a", Locale.US));
//        System.out.println(LocalDate.format(DateTimeFormatter.ofPattern("MMMM d',' yyyy hh':'mm a", Locale.US)));
//
//    }


}


