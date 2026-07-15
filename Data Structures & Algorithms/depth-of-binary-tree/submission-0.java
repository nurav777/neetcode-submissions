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
    public int height(TreeNode root, int height){
        if(root == null) return 0;
        int left = height(root.left,0);
        int right = height(root.right,0);
        return Math.max(left,right) + 1;
    }
    public int maxDepth(TreeNode root) {
        return height(root,0);
    }
}
