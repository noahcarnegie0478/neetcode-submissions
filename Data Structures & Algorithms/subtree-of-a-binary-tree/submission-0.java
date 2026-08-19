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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) return true;
        if (root == null || subRoot == null) return false;
        // find if match to sub root or not
        // if match, take out and run recursive
        TreeNode isMatchRoot = findSubRoot(root, subRoot.val);
        if (isMatchRoot == null) return false;
        return compareRoot(isMatchRoot, subRoot);



    }
    private TreeNode findSubRoot (TreeNode root, int val) {
        if (root == null ) return null;
        // search by bread first search might bring better performance
        ArrayList<TreeNode> searchMap = new ArrayList<>();
        
        searchMap.add(root);

        for (int index = 0; index < searchMap.size(); index++ ) {
            if (searchMap.get(index).val == val) return searchMap.get(index);
            if (searchMap.get(index).left != null) {
                searchMap.add(searchMap.get(index).left );
            }
            if (searchMap.get(index).right != null){
                searchMap.add(searchMap.get(index).right);
            }     
        } 
        return null;
        
    }
    //compare 
    private boolean compareRoot(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null ) return false;
        
        boolean compareLeft = compareRoot(left.left, right.left);
        boolean compareRight = compareRoot(left.right, right.right);

        return (compareLeft == compareRight) ? true : false;


    }
}
