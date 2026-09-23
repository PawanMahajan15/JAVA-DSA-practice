package class27;
class A{
    public int i;
    public int j;
      A(){
        i=1;
        j=2;
    }
        }
        class B extends A{
    int a;
    B(){
        super();
    }
        }
public class super_use extends B{
    public static void main(String[] args) {
        B obj=new B();
        System.out.println(obj.i+" "+ obj.j);
    }
}
