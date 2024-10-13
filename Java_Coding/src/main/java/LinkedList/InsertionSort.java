package LinkedList;

// https://leetcode.com/problems/insertion-sort-list/
public class InsertionSort {

    /*
    * Solution 1:
    * Intution: 1). backtrack using 2 integrated while loops
    *  2). use dummy for start condition
    *  3).
    * */
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode dummy = new ListNode(0);
        ListNode temp = head;

        while(temp != null) {
            ListNode curr = dummy;
            ListNode prev = temp.next;

            while(curr.next != null && curr.next.val < temp.val) {
                curr = curr.next;

            }

            temp.next = curr.next;
            curr.next = temp;

            temp = prev;
        }

        return dummy.next;
    }
}
