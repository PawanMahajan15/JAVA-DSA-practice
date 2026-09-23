package class54;

public class KOKO {
    private static int alocate(int piles[],int h){
        int start=1;
        int end=piles[0];
        int ans=-1;
        for(int e:piles){
            end=Math.max(end,e);
        }
        while(start<=end){
            int mid=(start+end)/2;
            if(isallocate(piles,h,mid)){
                ans=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }}
        return ans;}
    private static boolean isallocate(int piles[],int h,int mid) {
        long c=0;
        for(int e:piles){
           c+=(long)(e+mid-1)/mid;
        }
        if(c<=h){
            return true;}
        return false;}
    public static void main(String[] args) {
        int arr[]={312884470,218992190,88888821};
        int h=1000000000;
        System.out.println(alocate(arr,h));
    }
}
