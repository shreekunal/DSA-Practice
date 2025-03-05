class Solution {
    public String capitalizeTitle(String title) {
        String[] words = title.toLowerCase().split("\\s+");
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < words.length; i++){
            if(words[i].length()<3){
                ans.append(words[i]);
            } else {
                ans.append(Character.toUpperCase(words[i].charAt(0)));
                ans.append(words[i].substring(1));
            }
            if(i<words.length - 1) ans.append(" ");
        }
        return ans.toString();
    }
}