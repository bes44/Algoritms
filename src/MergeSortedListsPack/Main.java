package MergeSortedListsPack;
/**
 * Слияние двух отсортированных односвязных списков
 * Реализуйте метод, который сливает два отсортированных односвязных списка
 * в один отсортированный список.
 */

import static MergeSortedListsPack.MergeSortedLists.mergeTwoLists;
import static MergeSortedListsPack.MergeSortedLists.printList;

public class Main {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);
        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(6);
        ListNode mergedList = mergeTwoLists(l1, l2);
        printList(l1);
        printList(l2);
        System.out.println("Merged List:");
        printList(mergedList);
    }

}
