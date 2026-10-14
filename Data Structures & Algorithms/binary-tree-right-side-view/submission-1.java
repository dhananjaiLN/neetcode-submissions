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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>list=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        if(root==null)return list;
        q.offer(root);
        while(!q.isEmpty()){
            int s=q.size();
            TreeNode node=null;
            while(s>0){
                node=q.poll();
                if(node.left!=null)q.offer(node.left);
                if(node.right!=null)q.offer(node.right);
                s--;
            }
            list.add(node.val);
        }
        return list;
    }
}
