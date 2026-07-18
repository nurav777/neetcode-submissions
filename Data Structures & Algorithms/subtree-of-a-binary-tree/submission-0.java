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
    boolean ans = false;
    public boolean helper(TreeNode root, TreeNode subRoot){
        if(root == null && subRoot == null) { return true;}
        if(root == null || subRoot == null) { return false;}
        if(root.val != subRoot.val) { return false;}
        boolean left = helper(root.left, subRoot.left);
        boolean right = helper(root.right, subRoot.right);
        return left && right;
    }
    public void inorder(TreeNode root, TreeNode subRoot){
        if(root == null) return;
        inorder(root.left,subRoot);
        if(helper(root,subRoot)) {ans = true; return;} 
        inorder(root.right,subRoot);
    }  
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        inorder(root,subRoot);
        return ans;
    }
}
