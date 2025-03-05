class Solution {
    public String firstPalindrome(String[] words) {
        for(String word:words){
            if(pal(word)) return word;
        }
        return "";
    }
    public boolean pal(String word){
        int len = word.length() -1;
        for(int i = 0; i<=len/2; i++){
            if(word.charAt(i) != word.charAt(len-i)) return false;
        }
        return true;
    }
}