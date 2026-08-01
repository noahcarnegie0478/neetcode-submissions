// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
//         //filter range to skip array
//         //filter to find the target inside the array
//         int leftOutside = 0;
//         int rightOutside = matrix.length -1;
//         boolean result = false;
//         while (leftOutside <= rightOutside) {
//             int midleOutside = ((rightOutside - leftOutside) / 2) + leftOutside ;
//             int minNumber = matrix[midleOutside][0];
//             int maxNumber = matrix[midleOutside][matrix[midleOutside].length-1];
//             if (target >= minNumber && target <= maxNumber) {
//                 return findTarget(matrix[midleOutside], target);}
//             else if (target < minNumber) {
//                     rightOutside = midleOutside--;
//             }else {
//                     leftOutside = midleOutside++;
//                 }

//         }
//         return result;
        
//     }


//     public boolean findTarget(int[] array, int target) { 
//         int left = 0;
//         int right = array.length - 1;
//         while (left < right) {
//             int midle = ((right - left)/2) + left;
//             if (array[midle] == target) {
//                 return true;
//             }else {
//                 if (array[midle] > target) {
//                     right = midle--;
//                 }else {
//                     left = midle++;
//                 }
//             }
//         }
//         return false;
//     }

//             //     System.out.println("min"+ minNumber);
//             // System.out.println("max"+ maxNumber);
//             // System.out.println("target"+ target);
// }


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
