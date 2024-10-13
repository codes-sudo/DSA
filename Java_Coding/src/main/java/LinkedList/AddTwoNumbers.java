package LinkedList;

// https://leetcode.com/problems/add-two-numbers/description/
public class AddTwoNumbers {

    /*
    *
    *  solution 1
    * Intution : carry should be in sum so that if 1 all the list are empty we can create 1 node for that ex 9+9 = 18
    *  8 is an extra node
    *
    *  what number will modulus and divided ex sum % ? and sum / ?
    * */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if(l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if(l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10 ;
            sum = sum % 10;
            ListNode temp = new ListNode(sum);
            head.next = temp;
            head = head.next;
        }

        return dummy.next;
    }
}

