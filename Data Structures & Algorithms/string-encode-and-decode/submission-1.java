class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded_string = new StringBuilder();

        for (int i = 0; i < strs.size(); i++) {
            encoded_string.append(strs.get(i).length()).append("#").append(strs.get(i));
        }

        return encoded_string.toString();
    }

    public List<String> decode(String str) {
        int pos = 0;
        ArrayList<String> decoded_strs = new ArrayList<>();

        while (pos < str.length()) {
            int hashIndex = str.indexOf('#', pos);
            int length = Integer.parseInt(str.substring(pos, hashIndex));
            
            String word = str.substring(hashIndex + 1, hashIndex + 1 + length);
            decoded_strs.add(word);
            pos = hashIndex + 1 + length;
        }


        return decoded_strs;
    }
}
