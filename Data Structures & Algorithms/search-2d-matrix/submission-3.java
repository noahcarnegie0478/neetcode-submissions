class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;

        int top = 0;
        int bottom = matrix.length - 1;
        while (top <= bottom) {
            int midRow = top + (bottom - top) / 2; 
            int minNumber = matrix[midRow][0];
            int maxNumber = matrix[midRow][matrix[midRow].length - 1];

            if (target >= minNumber && target <= maxNumber) {
               
                return findTarget(matrix[midRow], target);
            } else if (target < minNumber) { 
                bottom = midRow - 1;
            } else {
                top = midRow + 1;
            }
        }
        return false;
    }

    public boolean findTarget(int[] array, int target) { 
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (array[mid] == target) {
                return true;
            } else if (array[mid] < target) {
             
                left = mid + 1;
            } else {
               
                right = mid - 1;
            }
        }
        return false;
    }
}
