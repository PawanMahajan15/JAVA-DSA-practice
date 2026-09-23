package class29_1;
import class29.DefaultAccessModifier;
public class Default2 extends DefaultAccessModifier {
    public static void main(String[] args) {
        Default2 obj=new Default2();
        System.out.println(obj.a);//as it is protected we can access it in different package through inheritance
       // obj.ghungru(); // but ghungru method is default as it can not be access in different package
    }
}
