class Solution {
    public int longestConsecutive(int[] nums) {
        int[] maxLong = new int[nums.length];
        int max = 0;
        HashMap<Integer, Integer> resource = new HashMap();
        int nextIndex = 0;

        //loop qua tung thanh phan
        for (int i = 0; i < nums.length; i++ ) {
            //check xem key da ton tai chua
             //neu roi, ke me no
            if (resource.containsKey(nums[i])) continue; 
            //neu chua
            //check xem co ton tai i - 1 hay la i + 1 khong 
            if (resource.containsKey(nums[i] - 1) || resource.containsKey(nums[i] + 1)) {
                 //neu co, tra index cua i, them + 1, roi them gia tri moi vao hash    
                if (resource.containsKey(nums[i] + 1) && resource.containsKey(nums[i] - 1) ) {
                    int currentIndex1 = resource.get(nums[i] -1 );
                     int currentIndex2 = resource.get(nums[i] + 1);
                    maxLong[currentIndex1] = maxLong[currentIndex1] + maxLong[currentIndex2] + 1;
                    resource.put(nums[i] + 1, currentIndex1);
                    resource.put(nums[i], currentIndex1);
                }else if (resource.containsKey(nums[i] - 1)) {
                    int currentIndex = resource.get(nums[i] - 1);
                    maxLong[currentIndex]++;
                    resource.put(nums[i], currentIndex);
                }
                else if (resource.containsKey(nums[i] + 1)) {
                    int currentIndex = resource.get(nums[i] + 1);
                    maxLong[currentIndex]++;
                    resource.put(nums[i], currentIndex);
                }

            }else {
                  // neu khong them no vao hashmap voi index tiep theo
                resource.put(nums[i], nextIndex);
                maxLong[nextIndex]++;
                nextIndex++;
            }
          

          
           
        }
        for (int i : maxLong) {
            if (i > max) max = i;
        }
        return max;
        
    }
}
