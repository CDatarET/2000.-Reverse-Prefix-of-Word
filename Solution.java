class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> stk = new Stack<Character>();
        for(int i = 0; i < word.length(); i++){
            stk.push(word.charAt(i));
            if(word.charAt(i) == ch){
                StringBuilder sb = new StringBuilder();
                while(!stk.empty()){
                    sb.append(stk.pop());
                }

                sb.append(word.substring(i + 1, word.length()));
                return(sb.toString());
            }
        }

        return(word);
    }
}
