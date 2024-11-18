class Solution {
    public int searchInsert(int[] nums, int target) {
      int left = 0;
      int right = nums.length - 1;
      while(left <= right){
          int midpoint = left + (right - left) / 2;
          if (nums[midpoint] == target){
              return midpoint;
          } if (nums[midpoint] < target){
              left = midpoint + 1;
          } else{
              right = midpoint - 1;
          }
      }
  
      return left;
    }
  }