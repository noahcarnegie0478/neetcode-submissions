class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        // loop through every string
        HashMap<Character, Integer> firstString = new HashMap();
        HashMap<Character, Integer> secondString = new HashMap();
        int differCharFirst = 0;
         int differCharSecond = 0;

        // loop through every hashmap and find how many of them are matching 

        for (Character ch: s.toCharArray()) {
            if (firstString.containsKey(ch)) {
                int amount = firstString.get(ch) + 1;
                firstString.put(ch,amount);
                

            }else {
                firstString.put(ch,1);
                differCharFirst++;

                
            }
        }
        for (Character ch: t.toCharArray()) {
            if (secondString.containsKey(ch)) {
                int amount = secondString.get(ch) + 1;
                secondString.put(ch,amount);
            }else {
                secondString.put(ch,1);
                differCharSecond++;
            }
        }
        if (differCharFirst != differCharSecond) return false;

         for (Character i : firstString.keySet()) {
            if (secondString.containsKey(i)) {
                int firstAmount = firstString.get(i);
                System.out.println("first Char: " + i + firstAmount);
                int secondAmount = secondString.get(i);
                System.out.println("second Char: " + i + secondAmount);

                if (firstAmount != secondAmount) return false;
            }else 
            {
                return false;
                }
        }
        return true;
    }
}
