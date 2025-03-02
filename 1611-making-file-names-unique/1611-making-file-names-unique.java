class Solution {
    public String[] getFolderNames(String[] names) {
        HashMap<String, Integer> hm = new HashMap<>();
        String res[] = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            if (!hm.containsKey(name)) {
                res[i] = name;
                hm.put(name, 1);
            } else {
                int k = hm.get(name);
                String nN = name + "(" + k + ")";
                while (hm.containsKey(nN)) {
                    k++;
                    nN = name + "(" + k + ")";
                }
                hm.put(name, k + 1);
                hm.put(nN, 1);
                res[i] = nN;
            }
        }
        return res;
    }
}