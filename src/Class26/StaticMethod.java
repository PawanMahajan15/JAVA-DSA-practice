package Class26;
public class StaticMethod {
    int a;
    static int b=89;
    public void  nonStatic(){
        b=98;
        a=78;
        Static();//can access static method in nonStatic method
    }
    public static void Static(){
        //a=90;     can not access instance variable
        b=46;
        //nonStatic();    can not access nonStatic method in Static method
    }

    public static void main(String[] args) {
        StaticMethod.b=34;
        StaticMethod obj=new StaticMethod();
        StaticMethod obj2=new StaticMethod();
        obj2.a=89;
        obj.a=36;
        System.out.println(obj.a);
        System.out.println(obj2.a);
        System.out.println(StaticMethod.b);
       StaticMethod.Static();
        System.out.println(b);//static variable
    }
}
class jai{
    public static void main(String[] args) {
       StaticMethod.b=12;
        StaticMethod obj=new StaticMethod();
        obj.a=57;
        System.out.println(obj.a);
        System.out.println(StaticMethod.b);
    }
}