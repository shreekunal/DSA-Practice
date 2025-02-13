class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char ch : s.toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        for (char ch : t.toCharArray()) {
            if (!hm.containsKey(ch)||hm.get(ch) == 0) {
                return ch;
            }
            hm.put(ch, hm.get(ch)-1);
        }
        return ' ';
    }
}