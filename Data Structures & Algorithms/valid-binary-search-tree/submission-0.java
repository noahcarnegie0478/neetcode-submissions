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
        if (root == null) return true;

        // check leftside and right side 
        boolean leftValidation = isValidBST(root.left);
        boolean rightValidation = isValidBST(root.right);
        boolean rightCondition = false;
        boolean leftCondition = false;


        // left has to be under or null 
        if (root.left != null) {
            leftCondition = root.val > root.left.val;
        }else {
            leftCondition = true;
        }
        //right has to be over or null 
        if (root.right != null) {
            rightCondition = root.val < root.right.val;
        }else {
            rightCondition = true;
        }
        return (leftValidation && rightValidation && rightCondition && leftCondition);

   

        //if two side is true then we will return true

        
    }
}
