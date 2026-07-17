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
    int max = Integer.MIN_VALUE;
    public int helper(TreeNode root, int curr){
        if(root == null) return 0;
        int left = helper(root.left , 0);
        int right = helper(root.right , 0);
        max = Math.max(max,left + right);
        return Math.max(left,right) + 1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int garbage = helper(root,0);
        return max;
    }
}
