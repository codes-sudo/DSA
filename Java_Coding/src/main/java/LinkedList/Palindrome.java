package LinkedList;

public class Palindrome {
    /*
    * Solution 1
    * Intution mid, reverse half check
    * check whether mid is even or odd using fast.next != null
    *
    *  if(fast != null) {
            slow = slow.next;
        }
        *
        *  breaks for[1,0,0]
    * */
    public boolean isPalindrome(ListNode head) {
        if(head.next == null) return true;
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }



        ListNode temp = head;
        ListNode prev = null;

        while(head != slow) {
            temp = head;
            head = head.next;
            temp.next = prev;
            prev = temp;
        }

        if(fast != null) {
            slow = slow.next;
        }

        while(prev != null && slow != null) {
            if(prev.val != slow.val) {
                return false;
            }
            slow = slow.next;
            prev = prev.next;
        }


        return true;
    }
}
