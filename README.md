# Challenge: Maximized Reduction

This challenge is part of the Dcoder platform and is titled **Maximized Reduction**. The objective of this challenge is to find the maximum number that can be obtained by removing exactly one digit from a given number.

## Problem Statement

You are given a number as a string. Your task is to remove one digit from this number and determine the maximum possible number that can be formed from the remaining digits.

### Input Format

- The first line contains an integer `T`, the number of test cases.
- The next `T` lines each contain a string representation of a number.

### Output Format

For each test case, output the maximum number that can be obtained after removing one digit.

### Example

**Input:**
3 123 4567 1001

**Output:**

23 567 101

# How to Run

Set Up Java: Ensure you have Java installed on your machine (version 8 or higher).
Copy the Code: Save the code in a file named MaximizedReduction.java.

# Challenge Logic

### Explanation

- For the first test case, removing the first digit `1` gives `23`, which is the maximum.
- For the second test case, removing the first digit `4` gives `567`, which is the maximum.
- For the third test case, removing the first `1` gives `001` (which is `1`), and removing the second `0` gives `101`, which is the maximum.

## Code Implementation for dcoder 


```java
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
```
---

# more information at 📂
[dcoder](https://dcoder.tech/)


[Java web docs](https://docs.oracle.com/en/java/)
