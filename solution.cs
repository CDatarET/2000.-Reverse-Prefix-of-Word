public class Solution {
    public string ReversePrefix(string word, char ch) {
        Stack<char> stk = new Stack<char>();
        for(int i = 0; i < word.Length; i++){
            stk.Push(word[i]);
            if(word[i] == ch){
                StringBuilder sb = new StringBuilder();
                while(stk.Count > 0){
                    sb.Append(stk.Pop());
                }

                sb.Append(word.Substring(i + 1));
                return sb.ToString();
            }
        }

        return word;
    }
}
