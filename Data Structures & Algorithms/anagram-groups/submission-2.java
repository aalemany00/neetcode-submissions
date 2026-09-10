class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hash = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            int[] key = new int[26];
            String word = strs[i];
            StringBuilder sb = new StringBuilder();
            char[] charArray = strs[i].toCharArray();

            for (int j = 0; j < strs[i].length(); j++) {
                key[charArray[j] - 'a']++;
            }

            for (int x = 0; x < key.length; x++) {
                sb.append(key[x]);
                sb.append(',');
            }

            hash.computeIfAbsent(sb.toString(), k -> new ArrayList<>()).add(word);
        }

        return (new ArrayList<>(hash.values()));
    }
}