package Homework7.src.Task1;

import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class GenerateRandomNumber {
    public static void main(String[] args) {
        Map<Long, String> result = LongStream.generate(() -> new Random().nextLong(0, 101))
                .limit(100)
                .mapToObj(i -> Math.round(i * Math.PI - 20))
                .filter(i -> i < 100)
                .sorted()
                .skip(3)
                .collect(Collectors.toMap(
                        i -> i,
                        i -> "Number: " + i,
                        (existing, replacement) -> existing));

        result.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}