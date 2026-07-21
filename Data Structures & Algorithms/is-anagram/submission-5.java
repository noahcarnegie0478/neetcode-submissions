class Solution {
    public boolean isAnagram(String s, String t) {
        // loop through every string
        HashMap<Character, Integer> firstString = new HashMap();
        HashMap<Character, Integer> secondString = new HashMap();
        HashSet<Character> totalString = new HashSet();
        // loop through every hashmap and find how many of them are matching 

        for (Character ch: s.toCharArray()) {
            if (!totalString.contains(ch)) { totalString.add(ch);}
            if (firstString.containsKey(ch)) {
                int amount = firstString.get(ch) + 1;
                firstString.put(ch,amount);
            }else {
                firstString.put(ch,1);
            }
        }
        for (Character ch: t.toCharArray()) {
            if (!totalString.contains(ch)) { totalString.add(ch);}
            if (secondString.containsKey(ch)) {
                int amount = secondString.get(ch) + 1;
                secondString.put(ch,amount);
            }else {
                secondString.put(ch,1);
            }
        }

         for (Character i : totalString) {
            if (secondString.containsKey(i) && firstString.containsKey(i)) {
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
