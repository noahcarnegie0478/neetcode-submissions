class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap();
        int lengthNums = nums.length;
        int[] result = {0,0};
        for (int i = 0; i < lengthNums; i++ ) {
            hashMap.put(nums[i],i);
        };
         for (int i = 0; i < lengthNums; i++ ) {
            int toBeExist = target - nums[i];
            if (hashMap.containsKey(toBeExist) && hashMap.get(toBeExist) != i) {
                    result[0] = i;
                    result[1] = hashMap.get(toBeExist); 
                    return result;   
            }
        }
        

        return result;
        
    }
}
