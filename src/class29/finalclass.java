package class29;
final class jio{
    void k1(){
        int i=89;
        System.out.println(i);
        String k="jai";
        System.out.println(k);
    }                               //final class can nither be inherit it means final class have no child
}                                   //but object can access all method of class
public class finalclass {
    public static void main(String[] args) {
        jio obj=new jio();
        obj.k1();
    }
}
