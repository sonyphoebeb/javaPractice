## 1. Sum of digits:
  
      int sum = 0;
      
      while (n > 0){
          int digit = n % 10;
          sum += digit;
          n = n/10;
      }
      
      System.out.println("Sum of digits is: " + sum);
  
