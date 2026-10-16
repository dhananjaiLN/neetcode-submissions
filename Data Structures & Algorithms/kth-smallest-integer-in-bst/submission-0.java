/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        ksmall(root,k,pq);
        return -pq.poll();
    }
    private void ksmall(TreeNode root,int k,PriorityQueue<Integer>pq){
        if(root==null)return;
        pq.offer(-root.val);
        while(pq.size()>k){
            pq.poll();
        }
        ksmall(root.left,k,pq);
        ksmall(root.right,k,pq);
    }
}
