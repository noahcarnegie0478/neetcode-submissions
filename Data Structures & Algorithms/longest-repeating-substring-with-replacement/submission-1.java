class Solution {
    public int characterReplacement(String s, int k) {
    //check every single number, and then move to the left of it. 
    //incase nothing the same then plus 1 of availability. 
    int finalMax = 0;
    int left = 0;
    char[] charArray = s.toCharArray();
    int currentMax = 1;
    int available = k;
    while (left <= charArray.length - 1 ) {
        int current = available != k ? left + 1 + (k -available) : left +1 ;
        if (left == charArray.length - 1 && available > 0 && charArray.length - currentMax - available > 0 ) {
            currentMax += available;
            finalMax = Math.max(currentMax, finalMax);
            break;
        }
        if (current >= charArray.length ) {
            left++;
            break;
        }
        
        if (charArray[left] == charArray[current]) {
            currentMax++;
            left = current;
            System.out.println("they equal so: " +  charArray[left] + " max currently is " + currentMax);

        }
        else {
            if (available > 0)  {
                currentMax++;
                available--;
                System.out.println("they are not but available : " +  charArray[left] + " max currently is " + currentMax);
            }else {
                left++;
                currentMax = 1;
                available = k;
                System.out.println("not available to move, neet to reset at : " +  charArray[left] + " left = " + left + " max currently is " + currentMax);
            }
        }

        finalMax = Math.max(currentMax, finalMax);

    }
    return finalMax;

    
            
    }
}
