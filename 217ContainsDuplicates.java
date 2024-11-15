import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> newList = new HashSet<Integer>();
        for (int num : nums){
            if (newList.contains(num)){
                return true;
            }
            newList.add(num);
        }
        return false;
    }
}

// Time complexity: O(n)
// Space complexity: O(n)