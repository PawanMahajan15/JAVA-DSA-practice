package class65;

public class QusingCircularArray {
    private int data[];
    private int rear;
    private int front;
    private  int size;

    public QusingCircularArray(int capacity){
        data=new int[capacity];
        rear=-1;
        front=-1;
        size=0;
    }
    public void offer(int val){
        if(size>= data.length){
            throw new ArrayIndexOutOfBoundsException("full ho gaya");
        }
        else {
            data[++rear%data.length]=val;
            size++;
            front=0;
        }
    }
    public Integer pull(){
        if(size==0){
            return  null;
        }
        int ans=data[front];
        front=(front +1)%data.length;
        size--;
        return ans;
    }
    public Integer peek(){
        if(size==0)return null;
        return data[front];
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        for (int i =0; i <size ; i++) {
            sb.append(data[(i+front)% data.length]);
            if(i<size-1){
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
