package class35_36_37_38_39_40;

public class naturalNums {
    public static void m2(int n){
        if(n==0)
            return;
          m2(n-1);
        System.out.println(n);
    }
    public static void m1(int n){
        if(n==0)return;
        System.out.println(n);
         m1(n-1);
    }
    public static void main(String[] args) {
        m1(15);//in Reverse order
        m2(15);//in simple order
    }
}
