import java.util.HashSet;
import java.util.Scanner;

class maxLenOfConsective{
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            set.add(arr[i]);
        }
        int maxCount=0;
        for(int i=0;i<n;i++){
            int a=arr[i];
            if(!set.contains(a-1)){
                int count=1;
                while (set.contains(a+1)) {
                    count++;
                    a++;
                }
                maxCount=Math.max(maxCount,count);
            }
        }
        System.out.println(maxCount);

    }

    
}