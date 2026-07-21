class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        if (sArray.length != tArray.length) return false;
        int theyAreTheSame = 0;
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        
        for (int i = 0; i < sArray.length; i++) {
            if (sArray[i] != tArray[i]) {
                return false;
            }
            theyAreTheSame++;
        }
        if (theyAreTheSame == sArray.length ) return true;
        return false;
    }
}
