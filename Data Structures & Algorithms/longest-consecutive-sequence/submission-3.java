class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return 1;
     //create hash set
     // find the start
     int max = 1;
     Set<Integer> store = new HashSet<>();
     for (int num : nums) { 
        store.add(num);
     }
     for (int num : store) {
        int front = num - 1;
        // int back = num + 1;
        if (store.contains(front)) {
            continue;
        }
       int current = num;
            int length = 1;
            while (store.contains(current + 1)) {
                length++;
                current++;
                max = Math.max(max,length);
            }
     }
     return max;
    }
}

