class Solution {
    public int[] productExceptSelf(int[] nums) {
        if (nums.length <= 0 ) return new int[0];
        if (nums.length == 1) return nums;
        int[] leftSide = new int[nums.length];
        int[] rightSide = new int[nums.length];

        leftSide[0] = 1;
        rightSide[nums.length - 1] = 1;

        //left loop
        for (int i = 1; i < nums.length; i++) {
            leftSide[i] = nums[i-1] * leftSide[i-1];
        }
        //right side
        for (int i = nums.length - 2; i >= 0; i--) {
            rightSide[i] = nums[i+1] * rightSide[i+1];

        }
        //final
        for (int i = 0; i < nums.length; i++) {
            nums[i] = leftSide[i] * rightSide[i];
        }
        return nums;
    
    }
}  
