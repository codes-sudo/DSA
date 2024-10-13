package LinkedList;
// https://leetcode.com/problems/remove-duplicates-from-sorted-list/
public class DeleteDuplicates {

    /*
    * Solution 1
    * Intution:  fast only
    * test case [1], [1,1,1], [1,1]
    *
    * */
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;
        if(head.next == null) return head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            if(fast.val == fast.next.val) {
                fast.next = fast.next.next;
            } else {
                fast = fast.next;
            }

        }
        return head;
    }
}



