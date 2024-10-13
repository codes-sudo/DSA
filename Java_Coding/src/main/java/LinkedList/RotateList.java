package LinkedList;

// https://leetcode.com/problems/rotate-list/description/
public class RotateList {
    /*
    * Solution 1 Brute Force
    * Intution:
    *
    * */
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return head;
        if(head.next == null) return head;
        ListNode temp = null;
        ListNode prev = null;

        for (int i = 0; i < k; i++) {
            temp = head;
            while (temp.next != null) {
                prev = temp;
                temp = temp.next;
            }

            prev.next = null;
            temp.next = head;
            head = temp;
        }

        return head;
    }


    /*
     * Solution 2
     * Intution: k % n
     *  i <= len - mod
     *
     * */
    public ListNode rotateRight2(ListNode head, int k) {
        if(head == null || k == 0 || head.next == null) return head;

        int len = 0;
        ListNode temp = head;
        ListNode prev = null;

        while(temp != null) {
            len++;
            temp = temp.next;
        }

        int mod = k % len;
        if (mod == 0) return head;
        temp = head;
        for(int i = 1; i <= len - mod; i++) {
            prev = temp;
            temp = temp.next;
        }

        while(temp.next != null) {
            temp = temp.next;
        }

        ListNode curr = head;
        head = prev.next;
        prev.next = null;
        temp.next = curr;
        return head;
    }
}
