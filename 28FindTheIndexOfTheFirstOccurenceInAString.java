class Solution {
    public int strStr(String haystack, String needle) {
        
        for(int i = 0; i <= haystack.length() - needle.length(); i++){
            String newSubstring = haystack.substring(i, i + needle.length());
            if (newSubstring.equals(needle)){
                return i;
            }
        }

        return -1;
    }
}