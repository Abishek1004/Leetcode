/*class Solution {
    public  void merge(int[] nums1, int m, int[] nums2, int n) {
        int position=m;
        for(int j=0;j<n;j++){
                nums1[position]=nums2[j];
                position++;
        }
        Arrays.sort(nums1);
    }
}*/

class Solution{
    public void merge(int[] nums1, int m, int[] nums2, int n){
        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k] = nums1[i];
                i--;
            }
            else{
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        while(j>=0){
            nums1[k]=nums2[j];
            j--;
            k--;
        }
    }
}