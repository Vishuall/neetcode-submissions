class Solution {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {

        StringBuilder result = new StringBuilder();

        for(String s : strs) {

            result.append(s.length());
            result.append("#");
            result.append(s);
        }

        return result.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String str) {

        List<String> list = new ArrayList<>();

        int i = 0;

        while(i < str.length()) {

            int j = i;

            // find #
            while(str.charAt(j) != '#') {
                j++;
            }

            // length of word
            int length = Integer.parseInt(str.substring(i, j));

            // actual word
            String word = str.substring(j + 1, j + 1 + length);

            list.add(word);

            // move pointer
            i = j + 1 + length;
        }

        return list;
    }
}