import java.util.ArrayList;
import java.util.Collections;
public class Merge2SortedList3 {
    public static ListNode addToList(ListNode head, int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
        } else {
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        return head;
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ret = null;
        ArrayList<Integer> list = new ArrayList<>();
        while (list1 != null) {
            list.add(list1.val);
            list1 = list1.next;
        }
        while (list2 != null) {
            list.add(list2.val);
            list2 = list2.next;
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            if (ret == null) {
                ret = new ListNode(list.get(i));
            } else {
                ret = addToList(ret, list.get(i));
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode node2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode node3 = mergeTwoLists(node1, node2);
        while (node3 != null) {
            System.out.print(node3.val + " ");
            node3 = node3.next;
        }
    }
}
