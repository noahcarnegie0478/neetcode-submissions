class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //filter range to skip array
        //filter to find the target inside the array
        int leftOutside = 0;
        int rightOutside = matrix.length -1;
        boolean result = false;
        while (leftOutside < rightOutside) {
            int midleOutside = ((rightOutside - leftOutside) / 2) + leftOutside ;
            int minNumber = matrix[midleOutside][0];
            int maxNumber = matrix[midleOutside][matrix[midleOutside].length-1];
            if (target > minNumber) {
                if (target <= maxNumber) {
                    return findTarget(matrix[midleOutside], target);
                }else {
                    leftOutside = midleOutside++;
                }
            }else if (target == minNumber) return true;
            else if (target < minNumber) {
                    rightOutside--;
            }

        }
        if (leftOutside == rightOutside) {
            result = findTarget(matrix[leftOutside], target);
        }
        return result;
        
    }


    public boolean findTarget(int[] array, int target) { 
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int midle = ((right - left)/2) + left;
            if (array[midle] == target) {
                return true;
            }else {
                if (array[midle] < target) {
                    right = midle--;
                }else {
                    left = midle++;
                }
            }
        }
        return false;
    }

            //     System.out.println("min"+ minNumber);
            // System.out.println("max"+ maxNumber);
            // System.out.println("target"+ target);
}
