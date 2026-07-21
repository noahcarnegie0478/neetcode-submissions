class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            int middle = left + (right - left)/ 2;
            if (nums[middle] == target) return middle;
            if (nums[left] == target) return left;
            if (nums[right] == target) return right;
            if (target < nums[middle]) {
                if (nums[right] < nums[middle] && nums[right] >= target ) {
               
                    left = middle + 1;
                }else {
     
                    right = middle -1;
                }
            }else {
                if (nums[left] > nums[middle] && nums[left] <= target) {
              
                     right = middle -1;
                }else {
                 
                    left = middle + 1;
                }
            }
        }
        return -1 ;
        
    }
}
