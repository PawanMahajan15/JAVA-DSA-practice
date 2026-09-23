package class65;

public class QueueImplimentation {
    public static void main(String[] args) {
        QusingLinkedList t=new QusingLinkedList();
        t.offer(3);
        t.offer(2);
        t.offer(1);
        System.out.println(t.pull());
        System.out.println(t.peek());
        t.pull();
        t.pull();
        System.out.println(t.pull());
        System.out.println(t.peek());
    }
}
