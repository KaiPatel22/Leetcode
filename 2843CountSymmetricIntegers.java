class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for (int i = low; i <= high; i++){
            int length = Integer.toString(i).length(); 
            if (length % 2 == 0){
                int halfLength = length / 2;
                int sumOfFirstHalf = 0;
                int sumOfSecondHalf = 0;

                for (int j = 0; j < halfLength; j++){
                    sumOfFirstHalf += Character.getNumericValue(Integer.toString(i).charAt(j));
                }
                for (int k = halfLength; k < length; k++){
                    sumOfSecondHalf += Character.getNumericValue(Integer.toString(i).charAt(k));
                }
                if (sumOfFirstHalf == sumOfSecondHalf){
                    count++;
                }
            }
        }
        return count;

    }
}