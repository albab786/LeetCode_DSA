/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) {
            return list2;
        }
        
        if(list2 == null) {
            return list1;
        }
                
        //Create a new list for the result list
        ListNode head = new ListNode(0);
        //We want to return the head so we should make it stay where it is
        //So introduce a new variable which will show head
        ListNode curr = head;
        
        while(list1!= null && list2 != null) {
            if(list1.val < list2.val) {
                curr.next = list1;
                list1 = list1.next;
            }else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }
        
        //Which one is not null add all of its left values.
        if(list1 != null) {
            curr.next = list1;
        } else {
            curr.next = list2;
        }
        return head.next;  
    }
}