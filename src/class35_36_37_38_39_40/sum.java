package class35_36_37_38_39_40;

public class sum {
    public static int m1(int n){
        if (n==0)return 0;
       return n+ m1(n-1);
    }
    public static void main(String[] args) {
        System.out.println(m1(5));
    }
}
