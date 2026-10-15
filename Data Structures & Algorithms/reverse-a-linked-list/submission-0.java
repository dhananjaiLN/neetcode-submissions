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
    public ListNode reverseList(ListNode head) {
        if(head==null)return head;
        ListNode ptr=head.next;
        ListNode temp=head;
        while(ptr!=null){
            ListNode nxt=ptr.next;
            if(temp==head)temp.next=null;
            ptr.next=temp;
            temp=ptr;
            ptr=nxt;
        }
        return temp;
    }
}
