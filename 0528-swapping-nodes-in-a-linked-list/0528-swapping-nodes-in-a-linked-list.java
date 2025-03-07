/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head, first = null, second = null;
        
        int len = 0;
        while (temp != null) {
            len++;
            if (len == k)
                first = temp;
            temp = temp.next;
        }
        
        temp = head;
        for (int j = 1; j <= len - k; j++) {
            temp = temp.next;
        }
        second = temp;
        
        int tVal = second.val;
        second.val = first.val;
        first.val = tVal;
        return head;
    }
}