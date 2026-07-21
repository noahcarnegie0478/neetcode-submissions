class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> listOfLists = new HashSet<>(); 
        int sizeLength = nums.length;
        if (sizeLength < 3) return new ArrayList(listOfLists);
        int left = 0;
        int right = 0;
        Arrays.sort(nums);
        
        for (int i = 0; i < sizeLength - 2;i++ ) {
        
           left = i+1;
           right = nums.length - 1;
           
           while (right > left ) {
            int expectation = nums[i] + nums[left] + nums[right];
                if (expectation == 0) {
                    List<Integer> newArray = Arrays.asList(nums[i], nums[left],nums[right] );
                    listOfLists.add(newArray);
                     right--;
                     left++;
                }else if  (expectation < 0){
                    left++;
                }else {
                    right --;
                }
           }
        }
        return new ArrayList(listOfLists);
    }
}
