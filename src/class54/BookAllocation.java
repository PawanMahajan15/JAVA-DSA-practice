package class54;
public class BookAllocation {
    private static int alocate(int pages[],int students){
        if(pages.length<students)return -1;
        int max=pages[0];
        int sum=0;
        int ans=-1;
        for(int e:pages){
            max=Math.max(max,e);
            sum=sum+e;
        }
        int start=max;
        int end=sum;
        while(start<=end){
            int mid=(start+end)/2;
            if(isallocate(pages,students,mid)){
                ans=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;
    }
    private static boolean isallocate(int pages[],int m,int mid) {
        int c=1;
        int sum=0;
        for(int e:pages){
            if(sum+e<=mid){
                sum+=e;
            }else{
                c++;
                sum=e;
            }
        }
        if(c<=m){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={12, 34, 67, 90};
        int m=2;
        System.out.println(alocate(arr,m));
    }
}
