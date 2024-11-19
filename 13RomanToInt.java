import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        int total = 0;
        HashMap<String, Integer> conversion = new HashMap<String, Integer>();
        conversion.put("I", 1);
        conversion.put("V", 5);
        conversion.put("X", 10);
        conversion.put("L", 50);
        conversion.put("C", 100);
        conversion.put("D", 500);
        conversion.put("M", 1000);
        for (int i = 0; i < s.length(); i++){
            int currentValue = conversion.get(Character.toString(s.charAt(i)));
            int nextValue = 0;
            if (i + 1 < s.length()){
                nextValue = conversion.get(Character.toString(s.charAt(i+1)));
            }
            int finalValue = currentValue;
            if (nextValue > currentValue){
                finalValue = nextValue - currentValue;
                i++;
            }
            total += finalValue;
        }
        return total;
    }
}