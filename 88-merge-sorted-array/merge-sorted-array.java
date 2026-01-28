class Solution {
    public  void merge(int[] nums1, int m, int[] nums2, int n) {
        int position=m;
        
        
        for(int j=0;j<n;j++){
                nums1[position]=nums2[j];
                position++;
        }
        Arrays.sort(nums1);
    }
}