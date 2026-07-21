class Solution {
    HashMap<Integer, Integer> storage = new HashMap<>();
    
    public int rob(int[] nums) {
        return dfs(nums, 0);
    }
    
    private int dfs(int[] nums, int i) {
        if (i >= nums.length) return 0;
        if (storage.containsKey(i)) return storage.get(i);
        int rob = nums[i] + dfs(nums, i + 2);
        int skip = dfs(nums, i + 1);
        int result = Math.max(rob, skip);
        storage.put(i, result);
        return result;
    }
}