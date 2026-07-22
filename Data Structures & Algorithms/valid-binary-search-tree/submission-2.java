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
    int prevVal = -1001;
    public void inorder(TreeNode root){
        if(root== null || ans){
            return;
        }
        inorder(root.left);
        if(root.val <= prevVal){
            ans = true;
            return;
        }
        else{
            prevVal = root.val;
        }
        inorder(root.right);
    }
    public boolean isValidBST(TreeNode root) {
        inorder(root);
        return !ans;
    }
}
