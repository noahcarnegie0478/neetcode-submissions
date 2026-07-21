class Solution {
     public  List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result =  new ArrayList<>();
        HashMap<String, Integer> hashMap = new HashMap<String,Integer>();
        int order = 0;
        for (String i : strs) {
       
            char[] arr = i.toCharArray();
            Arrays.sort(arr);
            String afterSort = new String(arr);
            System.out.println(afterSort);
            if (hashMap.containsKey(afterSort)) {
                result.get(hashMap.get(afterSort)).add(i);
            }else {
                ArrayList<String> toBeAdded = new ArrayList<>();
                toBeAdded.add(i);
                hashMap.put(afterSort, order);
                result.add(toBeAdded);
                order++;
            }
        }
        
        return result;
  
    }
}
