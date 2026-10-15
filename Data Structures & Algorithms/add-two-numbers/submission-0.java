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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null)return l2;
        if(l2==null)return l1;
        ListNode t1=l1;
        ListNode prev=null;
        int carry=0;
        while(l1!=null || l2!=null){
            int sum=carry;
            if(l1!=null)sum+=l1.val;
            if(l2!=null)sum+=l2.val;
            carry=sum/10;
            if(l1!=null){
                l1.val=sum%10;
                prev=l1;
                l1=l1.next;
                if(l2!=null)l2=l2.next;
            }
            else{
                prev.next=new ListNode(sum%10);
                prev=prev.next;
                l2=l2.next;
            }
        }
        if(carry!=0)prev.next=new ListNode(carry);
        return t1;
    }
}