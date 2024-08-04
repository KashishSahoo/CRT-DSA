import java.util.*;
class next_greatest_element{
    public static void main(String[] args){
        // int [] arr={1,3,4,7,2,3,1,4,10};
        int [] arr={11,1,4,7,3,10,1,2,3};
        Stack<Integer> st = new Stack<>();
        int [] nge=new int[arr.length]; 
        int n=arr.length;

        
        for(int i=n-1; i>=0;i--){
            while(!(st.isEmpty()) && arr[i]>st.peek() ){
                st.pop();
            }
            if(st.isEmpty()){
                nge[i]=-1;
            }
            else{
                nge[i]=st.peek();
            }
            st.push(arr[i]);
        }
        System.out.println(Arrays.toString(nge));
        
       
    }
    
}