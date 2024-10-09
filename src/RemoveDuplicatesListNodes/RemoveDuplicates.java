package RemoveDuplicatesListNodes;

import java.util.HashSet;

public class RemoveDuplicates {
    public static void removeDuplicates(ListNode head) {
        if (head == null) return;
        HashSet<Integer> seen = new HashSet<>();
        ListNode current = head;
        seen.add(current.val);
        while (current.next != null) {
            if (seen.contains(current.next.val)) {
                current.next = current.next.next; // Удаляем дубликат
            } else {
                seen.add(current.next.val);
                current = current.next;
            }
        }
    }
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

}
