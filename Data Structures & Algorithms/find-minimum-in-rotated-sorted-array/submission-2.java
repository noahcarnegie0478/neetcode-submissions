class Solution {
    public int findMin(int[] nums) {
        int min = nums[0];
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int middle = left + (right - left) /2;
            if (nums[middle ] > nums[right]) {
                left = middle + 1;  
            }else {
                right = middle;
            }
            min = Math.min(nums[left], nums[right]);
        }
        return min;
        
    }
}
