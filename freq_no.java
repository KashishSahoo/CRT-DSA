import java.util.*;
public class freq_no {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        try (Scanner sc = new Scanner(System.in)) {
        }
        int arr[]={1,2,1,2,2,3,3,3};
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i], i);
            }
            else{
                map.put(arr[i],map.get(arr[i]+1));
            }
        } 
        System.out.println(map);
    }
    
}
