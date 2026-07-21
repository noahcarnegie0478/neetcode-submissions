class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int middle = left + ((right - left) / 2);
            // mission : matching target
            if ( nums[middle] == target) return middle;
            if (nums[left] == target) return left;
            if (nums[right] == target) return right;
            // target < middle && target < left -> it is in the right side
            if (target < nums[middle] && target < nums[left]) {
                left = middle +1;
            }else {
                right = middle -1;

            }
            // target < middle && target < right => it is in the left side   
        }
        return -1;
    }
}
