import java.util.ArrayDeque;
import java.util.Deque;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode[] array = new ListNode[10_000];
        int i = 0;
        while (head != null) {
            array[i++] = head;
            head = head.next;
        }
        if (i > 0) {
            ListNode n;
            head = n = array[--i];
            n.next = null;
            while (--i >= 0) {
                n.next = array[i];
                n = array[i];
                n.next = null;
            }
            return head;
        }
        return null;
    }

    public static class ListNode {

        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
