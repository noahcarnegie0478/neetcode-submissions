class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> storage = new HashMap<Integer,Integer>();
        List<Integer>[] freq = new List[nums.length + 1];
        int[] result = new int[k];
        int count = 0;
        //add array for every single index
        for (int i =0; i< freq.length; i++) {
            freq[i] = new ArrayList<>();
        }
        //add value for every single key 
        for (int i = 0; i < nums.length; i++) {
            if (storage.containsKey(nums[i])) {
                storage.put(nums[i],storage.get(nums[i] ) + 1);

            }else {
                storage.put(nums[i], 1);
                
            } 
                            
        }
        // add order base on their value
        for (int i : storage.keySet()) {
          freq[storage.get(i)].add(i);
        }
          for (int i = freq.length - 1; i >= 0 && count < k; i--) {
            for (int num : freq[i]) {
                result[count] = num;
                count++;
                if (count == k) return result;
            }
        }
        return result;
    }
}
