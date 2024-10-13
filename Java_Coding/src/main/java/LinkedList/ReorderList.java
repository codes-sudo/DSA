package LinkedList;

import java.util.Stack;

// https://leetcode.com/problems/reorder-list/description/
public class ReorderList {

    /*
    * Solution 1
    * Intution : use stack, total
    * why total you have to get only half from stack
    *
    * To check this condition: temp.next = curr;
            temp = temp.next.next;
    *
    * check how temp.next = null
    * */
    public void reorderList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        int total = 0;
        int i = 0;
        ListNode temp = head;


        while(temp != null) {
            stack.push(temp);
            total++;
            temp = temp.next;
        }

        temp = head;

        while(i < total) {
            ListNode prev = stack.pop();
            prev.next = temp.next;
            temp.next = prev;
            temp = temp.next.next;
            i = i+2;
        }

        temp.next = null;
    }
}
