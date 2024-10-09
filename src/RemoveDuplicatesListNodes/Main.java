package RemoveDuplicatesListNodes;

import static RemoveDuplicatesListNodes.RemoveDuplicates.printList;
import static RemoveDuplicatesListNodes.RemoveDuplicates.removeDuplicates;

/**
 * Удаление дубликатов в односвязном списке
 * Напишите метод, который удаляет все дубликаты из односвязного списка.
 * Пример:
 * Input: 1 -> 2 -> 3 -> 2 -> 4 -> 1
 * Output: 1 -> 2 -> 3 -> 4
 */
public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(1);
        System.out.println("Before removing duplicates:");
        printList(head);
        removeDuplicates(head);
        System.out.println("After removing duplicates:");
        printList(head);
    }
}

