package class67;

public class StackImpimentation {
    public static void main(String[] args) throws Exception {
        StackUsingArray s=new StackUsingArray(10);
        s.push(10);
        s.push(30);
        s.push(90);
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.peek());
    }
}
