package LinkedList;


// https://leetcode.com/problems/merge-two-sorted-lists/description/
public class MergeLinkedLists {

    /*
    *
    * Solution 1
    *
    * Input: list1 = [1,2,4], list2 = [1,3,4]
        Output: [1,1,2,3,4,4]
    *
    * Intution:
    * 1) add in dummy node but using temp.next = list1; without creating new ListNode
    * temp.next = list1;
                list1 = list1.next;
    *
    * */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        while(list1 != null && list2 != null) {

            if(list1.val < list2.val) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }

            temp = temp.next;

        }

        temp.next = list1 != null ? list1 : list2;

        return dummy.next;
    }
}
