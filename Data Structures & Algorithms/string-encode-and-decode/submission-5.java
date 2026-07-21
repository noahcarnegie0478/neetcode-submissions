class Solution {

    public String encode(List<String> strs) {
        if (strs == null) return ""; 
        if (strs.size() == 0) return null;
        String secret = "$@s$";
        String finalCode = "";
        for (String current: strs) {
            finalCode = finalCode + current + secret;
        }
        return finalCode;
    }

    public List<String> decode(String str) {
        if (str == "") return new ArrayList<>(Arrays.asList(""));
        if (str == null) return new ArrayList<>();
        String secret = "$@s$";
        int secretLength = secret.length();
        String currentString = "";
        
        List<String> returnList = new ArrayList<>();
        
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar == secret.charAt(0)) {
                boolean same = false;
                for (int j = i, k = 0; j < secretLength + i; j++) {
                    char strKey = str.charAt(j);
                    char secretK = secret.charAt(k);
                    if (strKey != secretK ) {
                        break;
                    }
                    if (k == secretLength  - 1 && strKey == secretK ) {
                        same = true;
                    }
                    k++;
                }
                if (same) {
                    returnList.add(currentString);
                    currentString = "";
                    i = i + secretLength -1;
                }else {
                    currentString += currentChar;

                }
            }
            else {
                currentString += currentChar;
            }
        }
        return returnList;

    }
}
