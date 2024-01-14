public class Main {
    public static void main(String[] args) {
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
}


