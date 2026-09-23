package class20;

public class Overloading {
    public static int max(int a,int b){
        return a>=b?a:b;
    }
    public static double max(double a,double b,double c){
        double ans=a>=b?a:b;
        double ans2=c>=b?c:b;      //diffirent no. of parameters
        return ans>=ans2?ans:ans2;
    }
    public static double max(int a,double b){
        return a>=b?a:b;            //different order of parameter
    }                               //different type of parameter
    public static double max(double a,int b){
        return a>=b?a:b;
    }
    public static long max(long a,int b){
        return a>=b?a:b;
    }

    public static void main(String[] args) {
        System.out.println(max(83,48));
    }
}
