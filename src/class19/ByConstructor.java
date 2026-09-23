package class19;
 class constructor {
    String name;
    int rollNo;
    String clgName;
    public constructor(){           //constructor name Should same
        //default constructor
    }
    public constructor(String name,int rollNo,String clgName){
        this.clgName=clgName;
        this.name=name;
        this.rollNo=rollNo;
    }
    public void print(){
        System.out.println("name->"+name+", rollno->"+rollNo+", clgname->"+clgName);
    }
}
public class ByConstructor {
    public static void main(String[] args) {
        constructor c=new constructor();//calling default constructor
constructor c1=new constructor("pawan",189,"TIT");
constructor c2=new constructor("chetan",39,"lnct");
        System.out.println(c1.name);
        System.out.println(c1.clgName);
        System.out.println(c1.rollNo);
        System.out.println(c2.name);
        System.out.println(c2.clgName);
        System.out.println(c2.rollNo);
        System.out.println(c.rollNo+","+c.name);//it will print default values
    //when print method is constructed;
        c1.print();
        c.print();
        c2.print();
    }
}
