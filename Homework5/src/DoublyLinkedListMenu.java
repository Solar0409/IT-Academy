import java.util.Scanner;
//Task7
public class DoublyLinkedListMenu {
    static class DoubleLinkedListNode {
        int data;
        DoubleLinkedListNode next;
        DoubleLinkedListNode prev;

        public DoubleLinkedListNode(int data) {
            this.data = data;
        }
    }

    static class DoublyLinkedList {
        DoubleLinkedListNode head;
        DoubleLinkedListNode tail;

        public void add(int data) {
            DoubleLinkedListNode newNode = new DoubleLinkedListNode(data);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }

        public void printFromHead() {
            DoubleLinkedListNode current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }

        public void printFromTail() {
            DoubleLinkedListNode current = tail;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.prev;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoublyLinkedList list = new DoublyLinkedList();

        while (true) {
            System.out.println("\n1. Добавить элемент\n2. Просмотреть с начала\n3. Просмотреть с конца\n4. Выход");
            System.out.print("Выберите опцию: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Введите значение элемента: ");
                    int data = scanner.nextInt();
                    list.add(data);
                    break;
                case 2:
                    System.out.println("Список с начала:");
                    list.printFromHead();
                    break;
                case 3:
                    System.out.println("Список с конца:");
                    list.printFromTail();
                    break;
                case 4:
                    System.out.println("Выход из программы.");
                    return;
                default:
                    System.out.println("Неверный ввод. Пожалуйста, выберите опцию от 1 до 4.");
            }
        }
    }
}
