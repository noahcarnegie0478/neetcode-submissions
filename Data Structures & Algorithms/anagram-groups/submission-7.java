class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // loop into list
        // sort the string
        // save into hash the new list index and the key that sorted
        // return the list
        List<List<String>> finalResult = new ArrayList<>();
        Map<String, Integer> keyRecorder = new HashMap<String, Integer>();
        int currentIndex = 0;

        for (String i : strs) {
            String sortedString = stringSorter(i);
            if (keyRecorder.containsKey(sortedString)) {
                int indexValue = keyRecorder.get(sortedString);
                finalResult.get(indexValue).add(i);
            }
            else {
                ArrayList<String> newList = new ArrayList<String>();
                newList.add(i);
                keyRecorder.put(sortedString, currentIndex);
                finalResult.add(newList);
                currentIndex++;
            }
        }
        return finalResult;

        
    }

    public String stringSorter (String s) {
        int[] alphabetNumber = new int[26];
        char[] stringBreakdown = s.toCharArray();
        String finalResult = "";
        //push character of string in the list so later we can count how many time that they has been appeared
        for (char i : stringBreakdown) {
            int index = i - 'a';
            alphabetNumber[index]++;
        }
        //add into final Result;
        for (int i = 0; i < alphabetNumber.length; i++) {
            if (alphabetNumber[i] == 0) { continue;}
            String value = "" + (i+61);
            String result = value.repeat(alphabetNumber[i]);
            finalResult += result;
        }
        return finalResult;

    }
}
