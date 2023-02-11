import java.util.List;

public class RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = go(null, head, n, 0, 0);
        if (len == n) {
            return head.next;
        } else {
            return head;
        }
    }

    private int go(ListNode prev, ListNode node, int n, int i, int l) {
        if (node == null) {
            return l;
        }

        int len = go(node, node.next, n, i + 1, l + 1);
        if (i == len - n && i != 0) {
            prev.next = node.next;
        }
        return len;
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
