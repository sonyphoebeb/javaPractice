package basics;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 1234;
        int sum = 0;
        
        int temp = n; // Keep original value
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            temp = temp / 10;
        }
        
        System.out.println("Sum of digits of " + n + " is: " + sum);
    }
}
