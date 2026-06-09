class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // declaration of a HashMap
        Map<String, List<String>> res = new HashMap<>();
        for(String s : strs){
            // accessing all the values of array 
            char[] charArray = s.toCharArray();
            // converted each string element to string array
            Arrays.sort(charArray);
            // sorted the array
            String sortedS = new String(charArray);
            // converting to a string
            res.putIfAbsent(sortedS, new ArrayList <>());
            //  when sorted string is absent
            res.get(sortedS).add(s);
            // adding sortedS if not present
        }
        return new ArrayList <>(res.values());
    }
}
