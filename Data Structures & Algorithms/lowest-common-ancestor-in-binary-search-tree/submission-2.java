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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        HashSet<Integer> rootOfP = new HashSet<>();
        //add into rootOfP
        searchBinary(root, q, rootOfP);
        System.out.println(rootOfP);

        // create a hashmap to store the root of nodes in p
        // run the same one for q and then match them. 
        return null;
       

        
    }
    private void searchBinary(TreeNode root, TreeNode target, HashSet<Integer> master) {
        if (root == null) return;
        // search 
        if (root.val < target.val) {
            searchBinary(root.left, target, master);
        }
        if (root.val > target.val) {
            searchBinary(root.right, target, master);
        }
        //
        master.add(root.val);
    }

    
}
