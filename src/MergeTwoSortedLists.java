public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = null, p = null, n;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                n = list1;
                list1 = list1.next;
            } else {
                n = list2;
                list2 = list2.next;
            }
            if (p == null) {
                head = p = n;
            } else {
                p.next = n;
                p = n;
            }
            n.next = null;
        }
        if (list1 != null) {
            if (p == null) {
                head = list1;
            } else {
                p.next = list1;
            }
        } else if (list2 != null) {
            if (p == null) {
                head = list2;
            } else {
                p.next = list2;
            }
        }
        return head;
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
