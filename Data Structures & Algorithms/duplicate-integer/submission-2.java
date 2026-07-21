class Solution {
    public boolean hasDuplicate(int[] nums) {
        //use hashmap to store the key
        // loop through every single one. 
        // if found one duplicate, return true

        HashMap<Integer, String> duplicatePossibility = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            if (duplicatePossibility.containsKey(nums[i])) return true;
            else {
                duplicatePossibility.put(nums[i], "first time");
            }
        }
        return false;
        
    }
}