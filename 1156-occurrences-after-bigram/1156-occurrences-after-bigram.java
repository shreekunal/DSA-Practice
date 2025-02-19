class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String str[] = text.split(" ");
        ArrayList<String> li = new ArrayList<>();
        for(int i = 0; i < str.length - 2; i++){
            if(str[i].equals(first)){
                if(str[i+1].equals(second)){
                    li.add(str[i+2]);
                }
            }
        }
        return li.toArray(new String[0]);
    }
}