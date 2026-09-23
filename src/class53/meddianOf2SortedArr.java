package class53;

public class meddianOf2SortedArr {
    public static double median(int nums1[],int nums2[]){
        if(nums1.length>nums2.length){
            int temp[]=nums1;
            nums1=nums2;
            nums2=temp;
        }
         int n= nums1.length;
         int m=nums2.length;
         int start=0;
         int end= n;
         while(start<=end){
             int mid1=(start+end)/2;
             int mid2=(m+n+1)/2-mid1;
             int l1=mid1==0?Integer.MIN_VALUE:nums1[mid1-1];
             int r1=mid1==n?Integer.MAX_VALUE:nums1[mid1];
             int l2=mid2==0?Integer.MIN_VALUE:nums2[mid2-1];
             int r2=mid2==m?Integer.MAX_VALUE:nums2[mid2];
             if(l1<=r2&&l2<=r1){
                 if((m+n)%2==0) {
                   return  (Math.max(l1, l2)+ Math.min(r1, r2))/2.0;
                 }
                 else return Math.max(l1, l2);
             }else if(l2>r1){
                 start=mid1+1;
             } else {
                 end=mid1-1;
             }
         }
         return 0;
    }
    public static void main(String[] args) {
        int arr1[]={1,2};
        int arr2[]={3,4};
        System.out.println(median(arr1,arr2));
    }
}
