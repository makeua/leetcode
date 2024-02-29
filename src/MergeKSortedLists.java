import java.util.Arrays;

public class MergeKSortedLists {

    public ListNode mergeKLists(ListNode[] lists) {
        boolean running = true;
        ListNode head = null, cur = null;
        if (lists == null || lists.length == 0) {
            return null;
        }
        while (running) {
            int min = Integer.MAX_VALUE;
            int idx = -1;
            for (int i = 0; i < lists.length; i++) {
                if (lists[i] != null && lists[i].val < min) {
                    min = lists[i].val;
                    idx = i;
                }
            }
            if (idx == -1) {
                running = false;
            } else {
                if (cur != null) {
                    cur.next = lists[idx];
                }
                cur = lists[idx];
                if (head == null) {
                    head = cur;
                }
                lists[idx] = lists[idx].next;
                cur.next = null;
            }
        }
        return head;
    }

    public ListNode mergeKLists2(ListNode[] lists) {
        int[] vals = new int[150_000];
        int j = 0;
        for (int i = 0; lists != null && i < lists.length; i++) {
            while (lists[i] != null) {
                vals[j] = lists[i].val;
                lists[i] = lists[i].next;
                j++;
            }
        }
        if (j == 0) {
            return null;
        } else {
            Arrays.sort(vals, 0, j);
            ListNode head = new ListNode();
            head.val = vals[0];
            ListNode prev = head;
            for (int i = 1; i < j; i++) {
                ListNode n = new ListNode(vals[i]);
                n.val = vals[i];
                prev.next = n;
                prev = n;
            }
            return head;
        }
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
