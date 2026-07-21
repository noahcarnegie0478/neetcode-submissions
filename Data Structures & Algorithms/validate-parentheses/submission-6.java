class Solution {
    public boolean isValid(String s) {
        String A = "(";
        String B = ")" ;
        String C = "{" ;
        String D = "}" ;
        String E = "[";
        String F =  "]";
        int sizeString = s.length();
        Stack <String> newStack = new Stack<String>();

        for (int i = 0; i <sizeString; i++ ) {
            String newString = s.charAt(i) + "";
            if (newString.equals(A) || newString.equals(C) || newString.equals(E)) newStack.push(newString);
            else {
                if (!newStack.isEmpty()) {
                    if ( newString.equals(B) && newStack.peek().equals(A)  ) newStack.pop();
                    else if ( newString.equals(D) && newStack.peek().equals(C) ) newStack.pop();
                    else if ( newString.equals(F) && newStack.peek().equals(E) ) newStack.pop();
                    else newStack.push(newString);
                }else newStack.push(newString);
            }
        }
        return newStack.isEmpty();


    }
}
