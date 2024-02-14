package Homework7.src.Task3;

import java.util.Objects;

public class Calculator {
    int number=2;
    int number2=3;


    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public static int add(int number, int number2){
        return number+number2;
    }
    public  int add(int[] value){
        int sum=0;
        for (int element: value){
            sum=element+sum;
        }
        return  sum;
    }

    public static int sub(int number1, int number2){
        return number1-number2;
    }
    public static int mul(int number1, int number2){
        return number1*number2;
    }
    public static int div(int number1, int number2){
        if(number2==0){
            throw new IllegalArgumentException
                    ("Number cannot be devided by zero!");
        }
        return number1/number2;

    }
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber2() {
        return number2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Calculator that)) return false;
        return getNumber() == that.getNumber() && getNumber2() == that.getNumber2();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumber(), getNumber2());
    }

    public boolean isSumAllowed(int arg) {
        return true;
    }
}
