class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char ch : s.toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        List<Character> li = new ArrayList<>(hm.keySet());
        li.sort((a,b) -> Integer.compare(hm.get(b), hm.get(a)));
        StringBuilder sb = new StringBuilder();
        for(char ch : li){
            sb.append(String.valueOf(ch).repeat(hm.get(ch)));
        }
        return sb.toString();
    }
}