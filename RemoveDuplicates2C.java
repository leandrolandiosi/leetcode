import java.util.ArrayList;
public class RemoveDuplicates2C {
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
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode head2 = head;
        while (head2 != null && head2.next != null) {
            if (head2.val == head2.next.val) {
                head2.next = head2.next.next;
            } else {
                head2 = head2.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {

        ListNode node5 = new ListNode(3);
        ListNode node4 = new ListNode(3, node5);
        ListNode node3 = new ListNode(2, node4);
        ListNode node2 = new ListNode(1, node3);
        ListNode head = new ListNode(1, node2);

        ListNode i = deleteDuplicates(head);
        while (i != null) {
            System.out.println(i.val);
            i = i.next;
        }

    }
}

/*
import java.util.ArrayList;

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        ArrayList<Integer> values = new ArrayList<>();
        int ant = -9999;
        while (head != null) {
            if (ant != head.val) {
                values.add(head.val);
            }
            ant = head.val;
            head = head.next;
        }
        ListNode head3 = new ListNode(values.get(values.size() - 1));
        for (int i = values.size() - 2; i >= 0; i--) {
            ListNode head2 = new ListNode(values.get(i), head3);
            head3 = head2;
        }
        return head3;
    }
}*/