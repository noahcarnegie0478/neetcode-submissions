// class Solution {

//     public String encode(List<String> strs) {
//         String result = "";
//         for (String i : strs) {
//             int sizeString = i.length();
//             result = result + Integer.toString(sizeString) + "#!@" + i;
//         }
//         return result;

//     }

// public List<String> decode(String str) {
//         List<String> result = new ArrayList<>();
//         int i = 0;

//         while (i < str.length()) {
//             int j = i;
//             while (str.charAt(j) != '#') {
//                 j++;
//             }
//             int size = Integer.parseInt(str.substring(i, j));

//             j += 3;

 
//             String word = str.substring(j, j + size);
//             result.add(word);

//             i = j + size;
//         }

//         return result;
//     }
// }


public class Solution {

    public String encode(List<String> strs) {
        if (strs.isEmpty()) return "";
        StringBuilder res = new StringBuilder();
        List<Integer> sizes = new ArrayList<>();
        for (String str : strs) {
            sizes.add(str.length());
        }
        for (int size : sizes) {
            res.append(size).append(',');
        }
        res.append('#');
        for (String str : strs) {
            res.append(str);
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        if (str.length() == 0) {
            return new ArrayList<>();
        }
        List<String> res = new ArrayList<>();
        List<Integer> sizes = new ArrayList<>();
        int i = 0;
        while (str.charAt(i) != '#') {
            StringBuilder cur = new StringBuilder();
            while (str.charAt(i) != ',') {
                cur.append(str.charAt(i));
                i++;
            }
            sizes.add(Integer.parseInt(cur.toString()));
            i++;
        }
        i++;
        for (int sz : sizes) {
            res.add(str.substring(i, i + sz));
            i += sz;
        }
        return res;
    }
}
