package class31;
abstract class FM{
    abstract void radio();
}
interface phone {
     void message();
     void call();
}
interface smartPhone extends phone{
     void camera();
    void wallpaper();
}
interface  android extends smartPhone{
     void ios();
}
interface iphone extends smartPhone{
     void appleva();
}
 abstract class iPhone15  {
    abstract void camera48MP();

    void imessage(){
        System.out.println("it has imessage");
    }
}

    class samsung extends FM implements android{
        public static void main(String[] args) {
        samsung obj=new samsung();
        obj.call();
        obj.camera();
        obj.message();
        obj.radio();
        obj.wallpaper();

        apple obj1=new apple();
        obj1.appleva();
        obj1.call();
        obj1.imessage();
        obj1.camera48MP();
        obj1.camera();
        obj1.wallpaper();
        }

    @Override
    void radio() {

    }
    public void ios(){

    }

    @Override
    public void camera() {

    }

    @Override
    public void wallpaper() {

    }

    @Override
    public void message() {

    }

    @Override
    public void call() {

    }
}
 class apple extends iPhone15 implements iphone{

    @Override
    public void camera() {

    }

    @Override
    public void wallpaper() {

    }

    @Override
    public void message() {

    }

    @Override
    public void call() {

    }

    @Override
    public void appleva() {

    }

    @Override
    void camera48MP() {

    }
}