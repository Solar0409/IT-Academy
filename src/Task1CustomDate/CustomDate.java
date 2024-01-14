package Task1CustomDate;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.TextStyle;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;
//import java.time.Year;


public class CustomDate {
    private int year;
    private int month;
    private int date;


    public CustomDate() {


    }


    public class Year {
        private int yearValue;

        public Year(int yearValue) {
            this.yearValue = yearValue;
        }

        public int getYearValue() {
            return yearValue;
        }
        public boolean isLeapYear() {
            return yearValue % 4 == 0 && (yearValue % 100 != 0 || yearValue % 400 == 0);
        }
    }

    public class Month {
        private int monthValue;

        public int getMonthValue() {
            return monthValue;
        }

        public Month(int monthValue){
            if (monthValue<1 || monthValue>12){
                throw new IllegalArgumentException("Month value should be between 1 and 12");
            }
            this.monthValue = monthValue;
        }

    }

    public class Day {
        private int dayValue;
        private Month month;
        private Year year;
        public Day(int dayValue, Month month, Year year) {
            if (dayValue < 1 || dayValue > daysInMonth(month.getMonthValue(), year.isLeapYear())) {
                throw new IllegalArgumentException("Day value is invalid for the given month and year");
            }
            this.dayValue = dayValue;
            this.month = month;
            this.year = year;
        }

        public int getDayValue() {
            return dayValue;
        }

        private int daysInMonth(int month, boolean leapYear) {
            int[] days = {31, (leapYear ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            return days[month - 1];
        }

    }

    public CustomDate(int year, int month, int date) {
        this.year = year;
        this.month = month;
        this.date = date;
    }


    public static void main(String[] args) {
        CustomDate customDate1 = new CustomDate();
        CustomDate.Year year1 = customDate1.new Year(2023);
        CustomDate.Month month1 = customDate1.new Month(12);
        CustomDate.Day day1 = customDate1.new Day(31,month1,year1);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату в формате DD-MM-YYYY:");
        String inputDate = scanner.nextLine();

        // Форматтер для проверки и преобразования даты
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        try {
            // Парсинг и проверка даты
            LocalDate date = LocalDate.parse(inputDate, formatter);
            System.out.println("Введенная дата корректна: " + date);
        } catch (DateTimeParseException e) {
            System.out.println("Введенная дата некорректна, пожалуйста, введите дату в правильном формате.");

        }


        LocalDate date = LocalDate.now();
        System.out.println(date);
        System.out.println(date.getDayOfWeek());

        LocalDate date1 = LocalDate.of(2023, 12, 31);
        System.out.println(date1);
        System.out.println(Arrays.toString(DayOfWeek.values()));
        int year = 2024;

        boolean isLeapYear = isLeap(year);


        if (isLeapYear) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }

    public static boolean isLeap(int year) {
        return ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0));
    }

    public static String getDayStringNew(Task1CustomDate.LocalDate date1, Locale locale) {
        DayOfWeek day = date1.getDayOfWeek();
        return day.getDisplayName(TextStyle.FULL, locale);

    }
}

//Example
//public class Outer {
//
//
//    class InnerClass {
//
//    }
//    Outer(){}
//
//    public static void main(String[] args) {
//        Outer outerObject = new Outer();
//        Outer.InnerClass innerObject = outerObject.new InnerClass(); // создание экземпляра
//        внутреннего класса
//    }
//}





