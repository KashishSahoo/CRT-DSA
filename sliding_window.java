import java.util.Arrays;

public class sliding_window {
    public static void main(String[] args) {
        int [] arr={-1,4,0,2,9,1,7,2,1};
        int n=arr.length;
        int k=3;
        int [] maxSubArr=new int[n-k+1];
        int maxi;
        for(int i=0;i<n-k+1;i++){
            maxi=Integer.MIN_VALUE;
            for(int j=i;j<i+k;j++){
                if(arr[j]>maxi){
                    maxi=arr[j];
                }
            }
            maxSubArr[i]=maxi;

        }
         System.out.println(Arrays.toString(maxSubArr));

    }
}
