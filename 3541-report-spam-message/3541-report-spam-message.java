class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        HashSet<String> set = new HashSet<>();
        for (String s : bannedWords) {
            set.add(s);
        }
        int cnt = 0;
        for (int i = 0; i < message.length && cnt <= 2; i++) {
            if (set.contains(message[i]))
                cnt++;
        }
        return cnt >= 2 ? true : false;
    }
}