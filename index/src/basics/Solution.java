package basics;

public class Solution {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4};
        int[] arr2={4,5,6,7};
        System.out.println(findMedianSortedArrays(arr1,arr2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;

        if (m==0){
            if (n%2!=0) return nums2[n/2];
            return ((double)nums2[n/2]+(double)nums2[n/2-1])/2;
        }
        else if (n==0){
            if (m%2!=0) return nums1[m/2];
            return ((double)nums1[m/2]+(double)nums1[m/2-1])/2;
        }


        int first=0;
        int needed=(m+n)/2;

        int left=0;
        int right=m-1;
        while(true){
            int mid=(left+right)/2;
            if ((nums2[needed-mid-1]>nums1[mid] && nums1[mid+1]>=nums2[needed-mid-1]) || (nums2[needed-mid-1]<nums1[mid] && nums1[mid]<=nums2[needed-mid])){
                first=mid;
                break;
            }
            if (nums2[needed-mid-1]>nums1[mid])left=mid+1;
            right=mid-1;

        }

        if ((m+n)%2!=0){
            if (nums1[first]>nums2[needed-first-1]) return nums1[first];
            return nums2[needed-first-1];
        }
        int top1=(nums1[first]>nums2[needed-first-1])?nums1[first]:nums2[needed-first-1];
        int top2=(nums1[first]==top1 && nums1[first-1]>nums2[needed-first-1])?nums1[first-1]:nums2[needed-first-1];

        return ((double)top1+(double)top2)/2;
    }
}