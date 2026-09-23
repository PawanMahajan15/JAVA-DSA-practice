package class27;
class first{
    int data=86;
    public void t1(){
        System.out.println("nothing");
    }
}
class second extends first{
    int data=37;
    public void t2(){
       int data=78;
        System.out.println(data);//direct find nearest data
        System.out.println(this.data);//(this)keywords direct find in their local class
        System.out.println(super.data);//(super)keyword directly goes to parent class
    }
}
public class SuperKeywords {
    public static void main(String[] args) {
        second obj = new second();
        obj.t2();
    }
}
