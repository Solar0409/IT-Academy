package Task1;

import java.util.concurrent.ThreadLocalRandom;

public class GenerateRandomNumber {
    public static long generateRandomNumber(long n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must not be negative");
        }

        return ThreadLocalRandom.current().nextLong(n + 1);
    }

    public static void main(String[] args) {
        long n = 100;
        System.out.println(generateRandomNumber(n));
        System.out.println(generateRandomNumber(n-20));
        System.out.println(generateRandomNumber((long) (n* Math.PI)));
    }
}

