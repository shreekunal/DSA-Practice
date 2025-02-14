class Solution {
    public boolean isPathCrossing(String path) {
        HashSet<String> set = new HashSet<>();
        int x = 0;
        int y = 0;
        set.add("0,0");
        for (char ch : path.toCharArray()) {
            if (ch == 'N') y += 1;
            else if (ch == 'S') y -= 1;
            else if (ch == 'E') x += 1;
            else x -= 1;
            if(!set.add(x + "," + y)) return true;
            set.add(x + "," + y);
        }
        return false;
    }
}