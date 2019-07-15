public class Stack {
    int stack[] = new int[5];
    int top =0;
    int data=0;
    public void push(int data){
        if (top>5){
            System.out.print("Stack is full");
        }else {
            stack[top]=data;
            top++;
        }

    }
    public int pop(){
        if (isEmpty()){
            System.out.print("Stack is Empty");
        }else {
            int data;
            top--;
            data = stack[top];
            stack[top]=0;
        }
        return data;
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
