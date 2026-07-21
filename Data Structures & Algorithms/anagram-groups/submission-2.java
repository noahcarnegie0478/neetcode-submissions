class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> finalMap = new HashMap();

        for (int i = 0; i < strs.length; i++) {
            int[] count = new int[26];
            for (char j : strs[i].toCharArray()) {
                count[j - 'a'] += 1;
            }
            String key = Arrays.toString(count);
            finalMap.putIfAbsent(key, new ArrayList<>());
            finalMap.get(key).add(strs[i]);
            

        }
        return new ArrayList<>(finalMap.values());


    }
}

