class Solution:
    def reversePrefix(self, word, ch):
        stk = []
        for i in range(len(word)):
            stk.append(word[i])
            if(word[i] == ch):
                return "".join(stk)[::-1] + word[i + 1:len(word)]
        
        return word
