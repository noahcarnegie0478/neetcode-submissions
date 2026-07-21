class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> finalMap = new HashMap();

        for (int i = 0; i < strs.length; i++) {
            int[] count = new int[26];
            String newString = "";
            for (char j : strs[i].toCharArray()) {
                count[j - 'a']++;
            }
            // newString = Arrays.toString(count);
            // System.out.println(newString);
        
            for (int k = 0; k < count.length; k++) {
                newString = newString + count[k] + ",";  
            }
            
            if (!finalMap.containsKey(newString)) {
                finalMap.put(newString, new ArrayList());
            }
            finalMap.get(newString).add(strs[i]);

        }
        return new ArrayList<>(finalMap.values());


    }
}

