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
    
    public boolean isValidBST(TreeNode root) {
        // loop through every node
        // check validation if it is null or valid 
        return checkValid(root, null, null);
       
    }
    private boolean checkValid(TreeNode root, Integer min, Integer max) {
        if (root == null) return true;
          // check leftside and right side 
        boolean leftValidation = checkValid(root.left, min, root.val);
        boolean rightValidation = checkValid(root.right, root.val, max);
        if (min != null && root.val <= min) return false;
        if (max != null && root.val >= max) return false;
        return leftValidation && rightValidation;
      
    }
}
