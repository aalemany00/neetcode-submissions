class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> hashS = new HashMap<>();
        Map<Character, Integer> hashT = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }
        
        for (int i = 0; i < s.length(); i++) {
            hashS.put(s.charAt(i),hashS.getOrDefault(s.charAt(i),0) + 1);
            hashT.put(t.charAt(i),hashT.getOrDefault(t.charAt(i),0) + 1);
        }

        return (hashS.equals(hashT));
    }
}