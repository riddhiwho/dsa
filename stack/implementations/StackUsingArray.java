package implementations;

class Stack {
    int top;
    int cap;
    int[] arr;

    public Stack(int cap){
        this.cap = cap;
        this.top = -1;
        this.arr = new int[cap];
    }

    public boolean push(int element){
        if(top>=cap-1){
            System.out.println("Stack overflow.");
            return false;
        }else{
            arr[++top] = element;
            return true;
        }
    }

    public int pop(){
        if(top<0){
            System.out.println("Stack underflow.");
            return -1;
        }else{
            return arr[top--];
        }
    }

    public int peek(){
        if(top<0){
            System.out.println("Stack underflow.");
            return -1;
        }else{
            return arr[top];
        }
    }

    public boolean isEmpty(){
        return top<0;
    }

}

public class StackUsingArray {

    public static void main(String[] args) {
        Stack stack = new Stack(3);
        stack.push(1);
        stack.push(2);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        stack.push(3);
        stack.push(4);
        System.out.println(stack.peek());
        stack.push(5);
    }
    
}
