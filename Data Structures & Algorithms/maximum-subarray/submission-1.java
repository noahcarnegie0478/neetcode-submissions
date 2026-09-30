class Solution {
    public int maxSubArray(int[] nums) {
        // the idea is get one of the pointer to hold on the first index and max also = to this value. 
        // we get 1 int hold the sum
        // another int to hold the 
        int max =nums[0];
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int currentTotal = nums[i] + sum; 
            if (nums[i] >= currentTotal) sum = nums[i];
            else sum = currentTotal;
            max = Math.max(max, sum);
        }



        return max;


        
        
    }
}
