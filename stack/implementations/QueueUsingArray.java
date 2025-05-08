package implementations;

class Queue{
    int[] arr;
    int cap;
    int size;
    int front;

    public Queue(int cap){
        this.cap = cap;
        arr = new int[cap];
        size = 0;
        front = 0;
    }

    public int getFront(){
        if(size==0){
            System.out.println("Queue is empty.");
            return -1;
        }
        return arr[front];
    }

    public int getRear(){
        if(size==0){
            System.out.println("Queue is empty.");
            return -1;
        }
        int rear = (front+size-1)%cap;
        return arr[rear];
    }

    public void enqueue(int element){
        if(size==cap){
            System.out.println("Queue is full.");
            return;
        }
        int rear = (front+size)%cap;
        arr[rear] = element;
        size++;
    }

    public int dequeue(){
        if(size==0){
            System.out.println("Queue is empty.");
            return -1;
        }
        int res = arr[front];
        front = (front+1)%cap;
        size--;
        return res;
    }

}

public class QueueUsingArray {
    public static void main(String[] args) {
        Queue queue = new Queue(4);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.getFront());
        System.out.println(queue.getRear());
        System.out.println(queue.dequeue());
        System.out.println(queue.getFront());
    }   

}
