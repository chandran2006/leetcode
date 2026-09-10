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
    int count=0;
    public int averageOfSubtree(TreeNode root) {
        trav(root);
        return count;
    }
    private int[]trav(TreeNode root){
        if(root==null) return new int[]{0,0};
        int[] left=trav(root.left);
        int[] right=trav(root.right);
        int subtreesum=left[0]+right[0]+root.val;
        int subtreecount=left[1]+right[1]+1;
        if(subtreesum/subtreecount==root.val) count++;
        return new int[]{subtreesum,subtreecount};
    }
}