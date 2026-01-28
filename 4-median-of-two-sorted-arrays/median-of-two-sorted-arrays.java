class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n = nums1.length;
        int m = nums2.length;

        int[] result = new int[n + m];

        int i = n - 1;
        int j = m - 1;
        int k = n + m - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                result[k--] = nums1[i--];
            } else {
                result[k--] = nums2[j--];
            }
        }

        while (i >= 0) {
            result[k--] = nums1[i--];
        }

        while (j >= 0) {
            result[k--] = nums2[j--];
        }


        int len = result.length;
        if (len % 2 != 0) {
            return result[len / 2];
        } else {
            return (result[len / 2 - 1] + result[len / 2]) / 2.0;
        }
    }
}
