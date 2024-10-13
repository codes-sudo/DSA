package LinkedList;

// https://leetcode.com/problems/partition-list/
public class Partition {

    /*
    * Solution 1:
    * Intution : use 2 list and store elements < x on 1 list and same for 2nd condition
    *
    *
    * */
    public ListNode partition(ListNode head, int x) {


        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        ListNode tail = l1;
        ListNode tail2 = l2;
        ListNode curr = head;

        while (curr != null) {
            if (curr.val < x) {
                l1.next = curr;
                l1 = l1.next;
            } else {
                l2.next = curr;
                l2 = l2.next;
            }

            curr = curr.next;
        }

        l1.next = tail2.next;
        l2.next = null;
        return tail.next;
    }
}
