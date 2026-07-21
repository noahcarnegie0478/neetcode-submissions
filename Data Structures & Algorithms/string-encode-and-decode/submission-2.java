class Solution {

    public String encode(List<String> strs) {
        String result = "";
        for (String i : strs) {
            int sizeString = i.length();
            result = result + Integer.toString(sizeString) + "#!@" + i;
        }
        return result;

    }

// public List<String> decode(String str) {
//     List<String> result  = new ArrayList<>();
//     String currentDecoded = "";
//     for (int i = 0; i < str.length(); i++) {
//         char c = str.charAt(i);
//         int sizeKey = Integer.parseInt(String.valueOf(c));
//         if (str.charAt(i + 1) == '#' && str.charAt(i + 2) == '!' && str.charAt(i + 3) == '@') {
//             for (int j = i + 4; j < i + 4 + sizeKey; j++) {
//                 currentDecoded = currentDecoded + str.charAt(j);
//             }
//             result.add(currentDecoded);
//             currentDecoded = "";
//             i = i + 4 + sizeKey - 1;
//         }
//     }
//     return result;
// }
public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            int size = Integer.parseInt(str.substring(i, j));

            j += 3;

 
            String word = str.substring(j, j + size);
            result.add(word);

            i = j + size;
        }

        return result;
    }
}
