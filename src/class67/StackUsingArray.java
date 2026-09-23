package class67;

public class StackUsingArray {
    private int stack[];
    private int size;
     public StackUsingArray(int capacity){
         stack=new int[capacity];
         size=-1;
     }
     public void push(int data){
         if(size+1>= stack.length) {
             System.out.println("overflow");
             return;
         }
         stack[++size]=data;
     }
     public Integer pop() throws Exception {
         if(size==-1){
             System.out.println("underflow");
             return null;
         }
         return  stack[size--];
     }
     public Integer peek(){
         if(size==-1){
             System.out.println("underflow");
             return null;
         }
         return stack[size];
     }
     public String toString(){
         StringBuilder sb=new StringBuilder();
         sb.append("[");
         for (int i = 0; i <=size ; i++) {
             sb.append(stack[i]);
             if(i!=size){
                 sb.append(",");
             }
         }
         sb.append("]");
         return sb.toString();
     }
}
