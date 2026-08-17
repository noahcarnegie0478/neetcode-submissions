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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == q && p == null) return true;
        if (p == null || q == null || p.val != q.val) return false;
        boolean leftIsOk = isSameTree(p.left, q.left);
        boolean rightIsOk = isSameTree(p.right, q.right);
      
        return leftIsOk && rightIsOk;
        
    }
}
