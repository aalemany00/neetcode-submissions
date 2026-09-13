class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < strs.size(); i++) {
            sb.append(strs.get(i).length()).append("#").append(strs.get(i));
        }

        String encoded_string = sb.toString();
        return encoded_string;
    }

    public List<String> decode(String str) {
        int pos = 0;
        List<String> decoded_strs = new ArrayList<>();

        while (pos < str.length()) {
            int hashIndex = str.indexOf('#', pos);
            int length = Integer.parseInt(str.substring(pos, hashIndex));
            decoded_strs.add(str.substring(hashIndex + 1, hashIndex + 1 + length));
            pos = hashIndex + 1 + length;
        }


        return decoded_strs;
    }
}
