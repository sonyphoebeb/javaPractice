package basics;

import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {

        System.out.print("Enter a number: ");

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();

            int a = 0, b = 1;
            
            for(int i = 1; i <= n; i++){
                System.out.print(a + " ");
                
                int next = a + b;
                a = b;
                b = next;
            }
            System.out.println();
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }
        sc.close();
    }
}
