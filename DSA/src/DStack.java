import java.util.Calendar;

public class DStack {
    int capacity = 2;
    int stack[] = new int[capacity];
    int top =0;
    int data=0;
    public void push(int data){
        if (size()==capacity){
            expand();
        }
        stack[top]=data;
            top++;

    }

    private void expand() {
        int len = size();
        int newStack[]=new int[capacity*2];
        System.arraycopy(stack,0,newStack,0,len);
        stack=newStack;
        capacity *=2;
    }

    public int pop(){
        if (isEmpty()){
            System.out.print("Stack is Empty");
        }else {
            int data;
            top--;
            data = stack[top];
            stack[top]=0;
            shrink();
        }
        return data;
    }

    private void shrink() {
        int len = size();
        if (len<=(capacity/2)/2){
            capacity=capacity/2;
        }
        int newStack[]=new int[capacity];
        System.arraycopy(stack,0,newStack,0,len);
        stack=newStack;
    }

    public int size(){
        return top;

    }
    public boolean isEmpty(){
        return top<=0;
    }
    public void show(){
        for(int n : stack){
            System.out.print(n+"  ");
        }
    }
}
