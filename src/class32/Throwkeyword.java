package class32;

public class Throwkeyword {
    public static void age(int a){
        if(a<18){
           // throw new ArithmeticException();
            throw new ArithmeticException("kuch gad baad hai");
        }else{
            System.out.println("sab changa");
        }
    }
    public static void main(String[] args) {
        age(1);
    }
}
