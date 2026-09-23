package class29;
 class kalu{
    protected int a=78;
    protected void l1(){
        System.out.println("kkrh");
    }
}
    public class protectedAccessModifier extends kalu{
        public static void main(String[] args) {
            kalu obj=new kalu();
            System.out.println(obj.a);//in protected access we can access (var or method) in same package even in different class but not in different package
            obj.l1();                  //but it has exception it can be access in different package also with the help of inheritance
                                       //with few rules 1>inherit child class 2>make refference of child class of 2package
        }
    }
