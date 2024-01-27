public class Solution {
    public static DoubleLinkedListNode reverse(DoubleLinkedListNode head) {
        if (head == null) {
            return null;
        }

        DoubleLinkedListNode current = head;
        DoubleLinkedListNode temp = null;

        while (current != null) {
            // Меняем местами next и prev
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            // Перемещаемся к следующему узлу (который теперь предыдущий)
            current = current.prev;
        }

        // Проверяем, есть ли элементы в списке и обновляем голову
        if (temp != null) {
            head = temp.prev;
        }

        return head;
    }

    public static void main(String[] args) {
        // Создаем список для демонстрации
        DoubleLinkedListNode head = new DoubleLinkedListNode(1);
        DoubleLinkedListNode second = new DoubleLinkedListNode(2);
        DoubleLinkedListNode third = new DoubleLinkedListNode(3);
        DoubleLinkedListNode fourth = new DoubleLinkedListNode(4);

        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;
        third.next = fourth;
        fourth.prev = third;

        // Вызов функции reverse
        DoubleLinkedListNode newHead = reverse(head);

        // Вывод списка
        while (newHead != null) {
            System.out.print(newHead.data + " ");
            newHead = newHead.next;
        }
    }
}