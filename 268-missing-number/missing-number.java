class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedArray = n*(n+1)/2;
        int ActualArray = 0;
        for(int num:nums){
            ActualArray += num;
        }
        return expectedArray - ActualArray;
    }
}