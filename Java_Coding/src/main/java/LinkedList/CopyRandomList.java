package LinkedList;

// https://leetcode.com/problems/copy-list-with-random-pointer/description/


import java.util.HashMap;

public class CopyRandomList {

    /*
    * Solution
    * Intution: use hashmaop
    * https://leetcode.com/problems/copy-list-with-random-pointer/solutions/4003262/97-92-hash-table-linked-list/
    * https://leetcode.com/problems/copy-list-with-random-pointer/solutions/43491/a-solution-with-constant-space-complexity-o-1-and-linear-time-complexity-o-n/
    *
    * 1. In hashmap put old--> with new Node(old.val)
    * 2. How to connect links and random  oldToNew.get(temp).next = oldToNew.get(temp.next);[understand this point]
    * 3. return map.get(head)
    * */
    public ListNode copyRandomList(ListNode head) {

        if(head == null) return head;

        HashMap<ListNode, ListNode> oldToNew = new HashMap<>();

        ListNode temp = head;
        while(temp != null) {
            oldToNew.put(temp, new ListNode(temp.val));
            temp = temp.next;
        }

        temp = head;
        while(temp != null) {
            oldToNew.get(temp).next = oldToNew.get(temp.next);
            oldToNew.get(temp).random = oldToNew.get(temp.random);
            temp = temp.next;
        }
        return oldToNew.get(head);
    }
}
