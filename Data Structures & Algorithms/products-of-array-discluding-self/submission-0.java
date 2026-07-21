class Solution {
    public int[] productExceptSelf(int[] nums) {
        int sizeNums = nums.length;
        //calculate for pre-index 
        int[] preIndex = new int[sizeNums];
        int[] postIndex = new int[sizeNums];
        int[] outCome = new int[sizeNums];
        for (int i = 0; i < sizeNums; i++) {
            if (i == 0) preIndex[i] = 1;
            else {
                //previous index * previous index of previous
                preIndex[i] = preIndex[i-1] * nums[i-1];  
            }
            
        }
        //caculate for post-index
        for (int i = sizeNums-1; i >= 0; i--) {
            if (i == sizeNums-1) postIndex[i] = 1;
            else {
                postIndex[i] = postIndex[i+1] * nums[i+1];
            }
        
        }
        for (int i = 0; i < sizeNums; i++) {
            outCome[i] = preIndex[i] * postIndex[i];
        }
        //caculate for outcome
        return outCome;
    }
}  
