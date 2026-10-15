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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null)return head;
        ListNode temp=head;
        ListNode rev=reverse(head);
        if(n==1){
            rev=rev.next;
            return reverse(rev);
        }
        temp=rev;
        int idx=0;
        while(idx<n-2){
            temp=temp.next;
            idx++;
        }
        temp.next=temp.next.next;
        return reverse(rev);
    }
    private ListNode reverse(ListNode root){
        if(root==null)return null;
        ListNode ptr=root.next;
        ListNode temp=root;
        temp.next=null;
        while(ptr!=null){
            ListNode nxt=ptr.next;
            ptr.next=temp;
            temp=ptr;
            ptr=nxt;
        }
        return temp;
    }
}
