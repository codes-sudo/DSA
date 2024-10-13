package LinkedList;

// https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
public class RemoveNthFromEnd {

    /*
   * Solution 1
   *
   * Input: head = [1,2,3,4,5], n = 2
        Output: [1,2,3,5]
   *   Issue with counters why total and curr diff
   *
   * */
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode temp = head;
        ListNode prev = head;
        int total = 0;
        int curr = 1;
        while(temp != null) {
            total++;
            prev = temp;
            temp = temp.next;
        }

        if(n == total) {
            return head.next;
        }

        temp = head;
        while(curr < total - n) {
            curr++;
            temp = temp.next;
        }

        if(temp.next != null) {
            temp.next = temp.next.next;
        }

        return head;
    }


    /*
  * Solution 2
  *
  * Input: head = [1,2,3,4,5], n = 2
       Output: [1,2,3,5]
  *
  *  using Fast and Slow pointer
  *
  * */
    public ListNode removeNthFromEnd2(ListNode head, int n) {

        return head;
    }
}


