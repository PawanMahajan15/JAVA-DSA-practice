package class32;

class handalingMethod {
    public static int TryCatch(int a,int b){
        int div;
        try {
            System.out.println(div=a/b);
        }catch(ArithmeticException e){
           System.out.println(e);
        }
        return 0;
    }
}
public class ExceptionHandling  {
    public static void main(String[] args) {
//        handalingMethod obj=new handalingMethod();
//      obj.TryCatch(9,0);
//      obj.TryCatch(10,2);
        int a=5,b=0;
        System.out.println("jai shree ram");
        try {
          // int div=a/b;
            int []arr= new int [5];
            System.out.println(arr[10]);
        }catch (ArrayIndexOutOfBoundsException k){
            System.out.println(k.getMessage());
            System.out.println(k.toString());
            k.printStackTrace();
        } catch (ArithmeticException e){
            System.out.println(e);
        }
        finally {
            System.out.println("ye toh chalega hee kisika baap nahi rok sakta isko");
        }
        System.out.println("pappu pass jhala");
    }
}
