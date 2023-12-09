package Task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Deal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество игроков: ");
        int numberOfPlayers = scanner.nextInt();


        // Создаем колоду карт
        List<String> deck = createDeck();

        // Перемешиваем колоду
        Collections.shuffle(deck);

        // Раздаем карты игрокам
        dealCards(numberOfPlayers, deck);
    }

    // Метод для создания колоды карт
    private static List<String> createDeck() {
        List<String> deck = new ArrayList<>();

        String[] suits = {"Черви", "Бубны", "Крести", "Пики"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};

        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck.add(suits[i] + " " + ranks[j]);
            }
        }

        return deck;
    }

    // Метод для раздачи карт игрокам
    private static void dealCards(int numberOfPlayers, List<String> deck) {
        int cardsPerPlayer = 5;

        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.println("Игрок " + (i + 1) + ":");

            // Раздача пяти карт каждому игроку
            for (int j = 0; j < cardsPerPlayer; j++) {
                String card = deck.remove(0);
                System.out.println(card);
            }

            System.out.println();
        }
    }
}