package Homework7.src.Task1;

import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class GenerateRandomNumber {
    public static void main(String[] args) {
        Map<Long, String> result = LongStream.generate(() -> new Random().nextLong(0, 101)) // Генерация 100 случайных чисел
                .limit(100) // Ограничение потока до 100 элементов
                .mapToObj(i -> Math.round(i * Math.PI - 20)) // Умножение каждого числа на PI, вычитание 20 и округление к Long
                .filter(i -> i < 100) // Фильтрация чисел, меньших 100
                .sorted() // Сортировка чисел по возрастанию
                .skip(3) // Пропуск первых 3 чисел
                .collect(Collectors.toMap(
                        i -> i,
                        i -> "Number: " + i,
                        (existing, replacement) -> existing)); // Обработка дубликатов: сохраняем существующее значение

        // Вывод результата
        result.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}