package Task1;

import java.util.GregorianCalendar;


class Year_Leap {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int num=0;
        GregorianCalendar year = new GregorianCalendar();
        for (int i=2000;i<2100;i++)
        {
            if (year.isLeapYear(i))
                System.out.print("Leap Year:  " +i+"  \n");
        }
        System.out.println();
        long end = System.currentTimeMillis();

    }

}

