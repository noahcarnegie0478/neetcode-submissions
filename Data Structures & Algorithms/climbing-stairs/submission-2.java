class Solution {
    HashMap<Integer, Integer> hashList = new HashMap<>();

    public int climbStairs(int n) {
        return dfsFindStep(n);
    }

    public int dfsFindStep(int n) {
        if (n <= 2) return n;
        if (hashList.containsKey(n)) {
            return hashList.get(n);
        }
        int n1 = dfsFindStep(n - 1);
        int n2 = dfsFindStep(n - 2);
        int result = n1 + n2;
        hashList.put(n, result); 
        return result;
    }
}