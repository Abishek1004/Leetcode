class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] result = new int[nums.length];
        int PositiveNumber = -2;
        int NegativeNumber = -1;
        for(int n:nums){
            if(n>0){
                PositiveNumber +=2;
                result[PositiveNumber] = n;
            }
            else{
                NegativeNumber +=2;
                result[NegativeNumber] = n;
            }
        }
        return result;
    }
}