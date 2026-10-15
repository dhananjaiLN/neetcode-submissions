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
    public void reorderList(ListNode head) {
        if(head==null)return;
        List<ListNode>list=new ArrayList<>();
        ListNode ptr=head;
        while(ptr!=null){
            list.add(ptr);
            ptr=ptr.next;
        }
        int i=0;
        int j=list.size()-1;
        while(i<j){
            list.get(i).next=list.get(j);
            i++;
            list.get(j).next=list.get(i);
            j--;
            list.get(i).next=null;
        }
    }
}
