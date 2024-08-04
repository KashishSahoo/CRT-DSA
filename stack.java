class stackk{
    int arr[];
    int top;
    stackk(){
        arr= new int[10];
        top=-1;
    }
    void push(int x){
        try{
            arr[++top]=x;
        }
        catch(Exception e){
            System.out.println("No place");
        }
    }
    int pop(){
        try{
            return arr[top--];
        }
        catch(Exception e){
            System.out.println("Element Not Found");
            return -1;
        }
    }
    int peak(){
        return arr[top];
    }

    boolean isEmpty(){
        return top==-1?true:false;
    }
}

public class stack{
    public static void main(String[] args) {
        stackk st=new stackk();
        st.push(108);
        st.push(123);
        st.push(9090);
        System.out.println(st.pop());
        System.out.println(st.peak());
        System.out.println(st.isEmpty());
    }
}
