class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hash = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String word = strs[i];
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);
            
            hash.computeIfAbsent(sorted, k -> new ArrayList<>()).add(word);
        }

        return (new ArrayList<>(hash.values()));
    }
}
