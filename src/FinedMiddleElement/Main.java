package FinedMiddleElement;

import static FinedMiddleElement.FindMiddle.findMiddle;
import static FinedMiddleElement.FindMiddle.printList;

/**
 * Реализуйте метод, который находит средний элемент односвязного списка за
 * один проход по нему.
 * Пример:
 * Input: 1 -> 2 -> 3 -> 4 -> 5
 * Output: 3
 */
public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        printList(head);
        ListNode middle = findMiddle(head);
        System.out.println("Middle element: " + middle.val);
    }

}
