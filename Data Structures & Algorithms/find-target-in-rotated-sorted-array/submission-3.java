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
                    System.out.println("run 1" );
                    left = middle + 1;
                }else {
                    System.out.println("run 2" );
                    right = middle -1;
                }
            }else {
                if (nums[left] > nums[middle] && nums[left] <= target) {
                    System.out.println("run 3" );
                     right = middle -1;
                }else {
                    System.out.println("run 4" );
                    left = middle + 1;
                }
            }
            System.out.println("left " + left);
            System.out.println("right " + right);
        }
        return -1 ;
        
    }
}
