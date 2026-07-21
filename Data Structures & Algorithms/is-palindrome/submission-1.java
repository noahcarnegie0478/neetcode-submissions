class Solution {
    public boolean isPalindrome(String s) {
        // loop through the string to ignore all the space, just charactermatter
        // loop through the new string array and return 
        //condition: 0-9 , != 10 - 60 
        // 
        String store = s.toLowerCase();
        int left = 0;
        int right = store.length() - 1;
        while (left < right) {
            if (!Character.isLetterOrDigit(store.charAt(left))) {
                left++;
                continue;
            }
            if (!Character.isLetterOrDigit(store.charAt(right))) {
                right--;
                continue;
            }
            if (store.charAt(left) != store.charAt(right)) {
                return false;
            }
            left++;
            right--;


            
        }
        return true;   
    }
  
}
