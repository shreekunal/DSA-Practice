class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode fast = head, first = head, second = head;
        
        for (int i = 1; i < k; i++) {
            fast = fast.next;
        }
        first = fast;
        
        while(fast.next!=null){
            fast = fast.next;
            second = second.next;
        }

        int tVal = second.val;
        second.val = first.val;
        first.val = tVal;
        return head;
    }
}