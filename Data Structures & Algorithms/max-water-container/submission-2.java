class Solution {
    public int maxArea(int[] heights) {
        //topic: find best distance and height 
        int leftPointer = 0; 
        int rightPointer = heights.length - 1;
        int maxValue = 0;
        while (leftPointer < rightPointer) {
            // if ((rightPointer - leftPointer) <= 1) break;
            int value = Math.min(heights[leftPointer],heights[rightPointer]) * (rightPointer - leftPointer);
            maxValue = Math.max(value, maxValue);
            System.out.println("left: " + heights[leftPointer]);

            System.out.println("right: " + heights[rightPointer]);

            System.out.println("value: " + value);
            //if left > right -> move right
            if (heights[leftPointer] > heights[rightPointer]) { 
                rightPointer--;
            }else{
                leftPointer++;
            }
        }
        return maxValue;
        
    }
}
