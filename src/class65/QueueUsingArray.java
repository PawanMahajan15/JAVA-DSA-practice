package class65;

public class QueueUsingArray {
  private int []data;
 private int rear;
 public QueueUsingArray(int capacity){
     data=new int[capacity];
     rear=-1;
 }
 public void offer(int val){
     if(rear+1>data.length)throw new ArrayIndexOutOfBoundsException();
     else {
         data[++rear] = val;
     }
 }
 public Integer pull(){
     if (rear==-1)return null;
     else {
         int ans=data[0];
         for (int i = 0; i <rear ; i++) {
             data[i]=data[i+1];
         }
         rear--;
         return ans;
     }
 }
 public Integer peek(){
     if (rear==-1)return null;
     return data[0];
 }
 public String toString(){
     StringBuilder sb=new StringBuilder();
     sb.append("[");
     for(int i=0;i<=rear;i++){
         sb.append(data[i]);
         if(i!=rear){
             sb.append(",");
         }
     }
     sb.append("]");
     return sb.toString();
 }

}
