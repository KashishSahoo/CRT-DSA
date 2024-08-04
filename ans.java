 import java.util.Scanner;

public class ans {

    // Function to check if a number is a spy number
    public static boolean isSpyNumber(int num) {
        int originalNum = num;
        int digit;
        
        while (num > 0) {
            digit = num % 10;
            if (digit == 0 || originalNum % digit != 0) {
                return false;
            }
            num /= 10;
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();
        
        StringBuilder result = new StringBuilder();
        
        for (int i = 1; i <= N; i++) {
            if (isSpyNumber(i)) {
                result.append(i).append(" ");
            }
        }
        
        // Remove trailing space
        if (result.length() > 0) {
            result.setLength(result.length() - 1);
        }
        
        System.out.println(result.toString());
    }
} 
    

