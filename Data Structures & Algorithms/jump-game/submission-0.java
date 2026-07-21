class Solution {
    public boolean canJump(int[] nums) {
        if (nums.length == 1 ) return true;
        int distance =1;

        //loop from the back till the end
        //as long as the nums is bigger than distance.
        // reset distance to one
        for (int i = nums.length - 2; i >= 0; i-- ) {
            if (i==0 && nums[i] < distance) return false;
            if (nums[i] >= distance) {
                distance = 1;
            }else {
                distance++;
            }
        }
        return true;

        

    }
}
