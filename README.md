## 1. Sum of digits:
    import java.util.Scanner;

public class MyClass {
    
  public static void main(String args[]) {
 
      System.out.print("Enter number: ");

      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
       
      int sum = 0;
      
      while (n > 0){
          int digit = n % 10;
          sum += digit;
          n = n/10;
      }
      
      System.out.println("Sum of digits is: " + sum);
    }
}
