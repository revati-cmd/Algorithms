class Solution {
    public int missingNumber(int[] nums) {
                
        int wrongSum = 0;
        for(int num: nums) {
            wrongSum = wrongSum + num;
        }
        
        return ((nums.length*(nums.length+1))/2 )- wrongSum;
    }
}
