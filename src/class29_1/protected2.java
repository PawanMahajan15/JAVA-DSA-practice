package class29_1;
import class29.protectedAccessModifier;
public class protected2 extends protectedAccessModifier{
    public static void main(String[] args) {
       protected2 obj=new protected2();
        obj.l1();//in protected access we can access (var or method) in same package even in different class but not in different packag
        System.out.println(obj.a);// but it has exception it can be access in different package also with the help of inheritance
           obj.a=67;
        System.out.println(obj.a);//with few rules 1>inherit child class 2>make refference of child class of 2package
    }
}
                     //but we have to import the package first