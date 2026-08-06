package Queue;

public class queue_Imple {
    int [] data;
    public static final int DEFAULT_SIZE=5;
    int end=0;
    int size;
    public queue_Imple(){
        this(DEFAULT_SIZE);
    }
    public queue_Imple(int size){
        data=new int[size];
    }
    public boolean isFull(){
        return end==data.length;
    }
    public boolean isEmpty(){
        return end==0;
    }

    //insertion
    public void insert(int val){
        if(isFull()){
            System.out.println("Queue is Full");
        }
        data[end++]=val;
    }
    public int remove(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        int rem=data[0];
        for (int i=1;i<end ;i++){
            data[i-1]=data[i];
        }
        end--;
        return rem;
    }
    public int peek() {
        if (isEmpty()) {
            System.out.println("Empty");
        }
        return data[0];
    }
    // Display queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.print("Queue: ");
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[]args){
        queue_Imple qi=new queue_Imple(7);
        qi.insert(1);
        qi.insert(2);
        qi.insert(3);
        qi.display();
        System.out.println("Queue removed: " +qi.remove());
        qi.display();
        System.out.println("First element: "+qi.peek());
        qi.display();
        qi.insert(7);
        qi.insert(6);
        qi.display();
    }

}
