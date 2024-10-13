package LinkedList;

// https://leetcode.com/problems/reverse-linked-list/description/
/*
*
* Input: head = [1,2,3,4,5]
 Output: [5,4,3,2,1]
*
* []
*
* */
public class ReverseLinkedList {

    /*
    * sol 1
    * */
    public ListNode reverseList(ListNode head) {
        ListNode temp = null;
        ListNode prev = null;

        while(head != null) {
            temp = head;
            head = head.next;
            temp.next = prev;
            prev = temp;
        }
        return prev;
    }


    /*
     * sol 2
     * */
    public ListNode reverseList2(ListNode head) {
        ListNode newHead = null;

        while(head != null) {
            ListNode temp = head.next;
            head.next = newHead;
            newHead = head;
            head = temp;
        }
        return newHead;
    }


    /*
     * sol 3
     *
     * Using recursion
     *
     * */
    public ListNode reverseList3(ListNode head) {
        ListNode newHead = null;

        return newHead;
    }
}

