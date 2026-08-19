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
        ArrayList<TreeNode> similarList = new ArrayList<>(); 
        // find if match to sub root or not
        // if match, take out and run recursive
        findSubRoot(root, subRoot.val, similarList);
        for(int i = 0; i< similarList.size(); i++) {
            boolean currentCompare = compareRoot(similarList.get(i), subRoot);
            if (currentCompare == true) return true;
        }


        return false;
        



    }
    private void findSubRoot (TreeNode root, int val, ArrayList<TreeNode> similarList) {
        if (root == null ) return;
        // search by bread first search might bring better performance
        ArrayList<TreeNode> searchMap = new ArrayList<>();
        
        searchMap.add(root);

        for (int index = 0; index < searchMap.size(); index++ ) {
            if (searchMap.get(index).val == val) {
                similarList.add(searchMap.get(index));
                }
            if (searchMap.get(index).left != null) {
                searchMap.add(searchMap.get(index).left );
            }
            if (searchMap.get(index).right != null){
                searchMap.add(searchMap.get(index).right);
            }     
        }    
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
