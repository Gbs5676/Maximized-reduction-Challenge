import java.util.Scanner;

public class MaximizedReduction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt();
        
        while (T-- > 0) {
            String numStr = scanner.next();
            int maxNumber = Integer.MIN_VALUE;
            
            for (int i = 0; i < numStr.length(); i++) {
                String newNumberStr = numStr.substring(0, i) + numStr.substring(i + 1);
                int newNumber = Integer.parseInt(newNumberStr);
                
                if (newNumber > maxNumber) {
                    maxNumber = newNumber;
                }
            }
            
            System.out.println(maxNumber);
        }
        
        scanner.close();
    }
                  }
