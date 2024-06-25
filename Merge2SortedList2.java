public class Merge2SortedList2 {

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
        ListNode ret = new ListNode();
        while (list1 != null) {
            while (list2 != null) {
                if (list1.val > list2.val) {
                    if ((list1.val <= ret.val) || (ret.val == 0)) {
                       if (ret.val == 0 ){ret = new ListNode(list2.val);}else{
                        ret = addToList(ret,list2.val);}
                    }
                    } else if (list1.val <= list2.val) {
                        ret = addToList(ret,list1.val);
                        if (list1.val == list2.val){
                            ret = addToList(ret,list1.val);
                        }
                        break;
                    }
                list2 = list2.next;
                }
            list1 = list1.next;
            }
        return ret;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(2, new ListNode(3, new ListNode(4)));
        ListNode node2 = new ListNode(1, new ListNode(3, new ListNode(5)));
        ListNode node3 = mergeTwoLists(node1,node2);
        while (node3 != null) {
            System.out.print(node3.val + " ");
            node3 = node3.next;
        }
    }
}
