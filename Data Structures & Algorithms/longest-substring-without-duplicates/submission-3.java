class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<String, Integer> toTrack = new HashMap<>();
        int maxLength = 0;
        int currentLength = 0;
        int left = 0;
        int right = 0;
        while (right < s.length()) {
            String c = String.valueOf(s.charAt(right));
            if (toTrack.containsKey(c)) {
                int key = toTrack.get(c);
                if (key >= left) {
                    left = key + 1;
                }
                toTrack.put(c, right);
                currentLength = right - left + 1;
            }
            else {
                toTrack.put(c, right);
                currentLength++;
            }
            maxLength = Math.max(maxLength, currentLength);
            right++;
        }
       
        return maxLength;
    }
}
