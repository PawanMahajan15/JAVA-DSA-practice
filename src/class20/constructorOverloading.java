package class20;

public class constructorOverloading {
    public constructorOverloading(){
        System.out.println("nothing");
    }
    public constructorOverloading(String a){
        System.out.println("a");
    }
    public constructorOverloading(String a,int b){
        System.out.println(a+","+b);
    }
    public constructorOverloading(int a,int b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        constructorOverloading m=new constructorOverloading("pawan",182);
    constructorOverloading s=new constructorOverloading(182,189);
    }
}
