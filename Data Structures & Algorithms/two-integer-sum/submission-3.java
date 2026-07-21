class Solution {
    public int[] twoSum(int[] nums, int target) {
        // has to add every number into hashmap, save the index 
        // parenthese = containsKey of target - nums[i] && i != target - nums[i]
        HashMap<Integer, Integer> listHash = new HashMap();
        int[] finalResult = new int[2];
        for (int i = 0; i < nums.length; i++) {
            
            int result = target - nums[i];
            
            if (listHash.containsKey(result) && listHash.get(result) != i) {
                int positionInHash = listHash.get(result);
                finalResult[0] = i < positionInHash ? i : positionInHash;
                finalResult[1] = i > positionInHash ? i : positionInHash;
            }else {
                listHash.put(nums[i], i);
            }
            
        }
        return finalResult;
        
        
    }
}
