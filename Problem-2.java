class Solution {
    //Time Complexity:-O(n)
    //Space Complexity:-O(1)
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        int count = 0;
        while(count<=n){
            fast = fast.next;
            count++;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        ListNode temp=slow.next;
        slow.next = slow.next.next;
        temp.next=null;
        return dummy.next;
    }
}