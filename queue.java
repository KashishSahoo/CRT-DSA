class queuee{
    int arr[];
    int front;
    int rear;
    int n=10;
    queuee(){
        arr= new int[10];
        front=-1;
        rear=-1;
    }
    void push(int x){
       if((rear+1)%n==front){
        System.out.println("Queue is full");
       }
       else if (rear==-1 && front==-1) {
        front++;    
       }
       arr[++rear]=x;
    }
    int pop(){
        int ans;
        if (rear==-1 && front==-1){
            System.out.println("No elements");
        }
        else if(rear==front){
            ans=arr[front];
            front=-1;
            rear=-1;
        }
        ans=arr[front++];
        return ans;
      
    }
    int peak(){
        return rear;
    }

    boolean isEmpty(){
        return front==-1 && rear==-1?true:false;
    }
}

public class queue{
    public static void main(String[] args) {
        queuee que=new queuee();
        que.push(1);
        que.push(2);
        que.push(3);
        System.out.println(que.pop());
        System.out.println(que.peak());
        System.out.println(que.isEmpty());
    }
}
