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
        if (root == null) return 0;
        List<Integer> result = new ArrayList<>();
        dfs(root, result);
        return result.get(k-1);



       // we will get in to a node 
       // if it has a left -> keep going 
       // if it dont has a left -> return false 
       // then we check if it has a right or not 
       // if it has a right we add ourslef first and then we add a right 
    }
    public void dfs(TreeNode root, List<Integer> array) {
        if (root == null) return;
        dfs(root.left,array);
        array.add(root.val);
        dfs(root.right,array);
    }
}
