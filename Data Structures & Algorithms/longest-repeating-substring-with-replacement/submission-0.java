class Solution {
    public int characterReplacement(String s, int k) {
    //loop first time to get the start index of item into hash map 
    // then fill the gap to expect the longest

    char[] charArray = s.toCharArray();
    Map<Character, Integer> uniqueCharacter = new HashMap();
    int finalMax = 0;
    for (int i = 0; i < charArray.length; i++) {
        if (uniqueCharacter.containsKey(charArray[i])) continue;
        uniqueCharacter.put(charArray[i], i );
    } 
    for (Character i : uniqueCharacter.keySet()) {
        int left = uniqueCharacter.get(i);
        int current = left + 1;
        int available = k;
        int currentMax = 1;
        // current < charArray 
        while (current < charArray.length ) {
            if (available <= 0 && charArray[left] != charArray[current]) break;
            if (charArray[left] != charArray[current]) {
                available--;
            }
            currentMax++;
            current++;   
            // k > 0 
        }
        if (available > 0 && (charArray.length - (currentMax + available) >= 0) ) currentMax += available;
        // if still the loops end, and k is > 0 
        // as long as currentMax + k < length -> then + k 
        finalMax = Math.max(finalMax, currentMax);
        System.out.println("Max of " + i + ": " + currentMax);
        }  
        
    return finalMax;
            
    }
}
