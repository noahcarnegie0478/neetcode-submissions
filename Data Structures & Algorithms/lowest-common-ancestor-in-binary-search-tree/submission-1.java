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
        ArrayList<TreeNode> master = new ArrayList<>();
        master.add(new TreeNode(0));
        checkMatch(root, p.val, q.val, master);
        if (master.get(0).val == 0) {
            //check if p and q related 
            if (p.left.val == q.val || p.right.val == q.val ) return p;
            if (q.left.val == q.val || q.right.val == p.val ) return q;
        }
        return master.get(0);

        
    }

    private boolean checkMatch(TreeNode root, int valP, int valQ, ArrayList<TreeNode> result) {
        if (root == null) return false;
        //mainly check if the right and left are true or not. 

        System.out.println("root = " + root.val);
        boolean leftCheck = checkMatch(root.left, valP,valQ, result);
        boolean rightCheck = checkMatch(root.right,valP,valQ, result);
        if (leftCheck == rightCheck && leftCheck == true) {
        System.out.println("result before match: " + result.get(0).val);
        result.set(0, root);
        System.out.println("result after match: " + result.get(0).val);
        };

        if (root.val == valP || root.val == valQ) return true;
        return false;
    }
}
