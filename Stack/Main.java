
 class Peek {
    int size;
    int top;
    int[] arr;
    
    //Constructor
    Peek (int size){
        this.size=size;
        this.top=-1;
        this.arr=new int[size];
    }
    
    boolean isEmpty(){
        return top ==-1;
    }
    boolean isFull(){
        return top==size-1;
    }

    void push(int val){
        if(isFull()){
            System.out.println("Stack Overflow Cannot push "+val);
        }else{
            top++;
            arr[top]=val;
        }
    }

    int pop(){
        if (isEmpty()){
            System.out.println("Stack Underflow Cannot pop");
            return -1;
        } else{
            int val=arr[top];
            top--;
            return val;
        }
    }
    int peek(int i){
        int index =top-i-1;
        if(index<0){
            System.out.println("Invalid position");
            return -1;
        }
            else{
                return arr[index];
            }
        
    }
}

public class Main {
    public static void main(String[] args) {
        Peek st =new Peek(50);
        System.out.println("Stack created successfully");
        System.out.println("Before pushing, Full: "+st.isFull());
        System.out.println("Before pushing, Empty: "+st.isEmpty());

        st.push(10);
        st.push(20);
        st.push(50);
        st.push(60);
        System.out.println("Top element (peek 1): "+ st.peek(1));
        System.out.println("Top element (peek 1): "+ st.peek(2));

        System.out.println("Popped: "+ st.pop());
        System.out.println("Now top element :"+st.peek(1));


    }
}
