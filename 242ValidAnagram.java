import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> string1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> string2 = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++){
            char currentChar = s.charAt(i);
            int count;
            if (string1.get(currentChar) == null){
                count = 0;
            }else{
                count = string1.get(currentChar).intValue();
            }
            string1.put(currentChar, count+1);
        }
        for (int i = 0; i < t.length(); i++){
            char currentChar = t.charAt(i);
            int count;
            if (string2.get(currentChar) == null){
                count = 0;
            }else{
                count = string2.get(currentChar).intValue();
            }
            string2.put(currentChar, count+1);
        }

        return string1.equals(string2);

    }
}