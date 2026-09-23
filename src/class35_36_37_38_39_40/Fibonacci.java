package class35_36_37_38_39_40;
public class Fibonacci {
    public static void m1(int n,int first,int second){
       if(n==1)return;
       int third=first+second;
        System.out.print(third+" ");
         m1(n-1,second,third);
    }
    public static int fibo(int n){
        System.out.println("call"+n);
        if (n<=1)return n;
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        int first=0,second=1;
        System.out.print(first+" "+second+" ");
        m1(10,0,1);
       // System.out.println("\nrequired term= "+fibo(5));
    }
}