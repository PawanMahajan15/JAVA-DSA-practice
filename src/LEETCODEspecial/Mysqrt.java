package LEETCODEspecial;

public class Mysqrt {
    public static long sqrt(int  x){
        long start=0;
        long end =x;
        long ans=0;
        while(start<=end){
            long mid=start+(end-start)/2;
           if(mid*mid<=x){
               ans=mid;
              start=mid+1;
           }else {
               end=mid-1;
           }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(sqrt(4));
    }
}
