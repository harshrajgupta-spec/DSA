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
    public ListNode rotateRight(ListNode head, int k) {
        
        ListNode slow=head;
        ListNode fast=head;

        int len=0;
        while(fast!=null){
            len++;
            fast=fast.next;
        }
        if(len==0){
            return head;
        }
        fast=head;
        for(int i=0; i<k%len; i++){
            fast=fast.next; 
        }

        while(fast.next!=null){ 
            slow=slow.next;
            fast=fast.next;
        }
        fast.next=head;
        ListNode temp=slow.next;
        slow.next=null;
        return temp;
    }
}