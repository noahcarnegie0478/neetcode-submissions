class Solution {
    public boolean canJump(int[] nums) {

        //currentMax 
        int currentMax = 1;

        //logic = if we go to the next one
        // and we find the number is bigger than out currentMax => then it is worth to replace. 

        for (int i = 0; i < nums.length -1; i++) {
            currentMax--;
            currentMax = Math.max(nums[i], currentMax);

        }
        return currentMax > 0;
        
    }
}
