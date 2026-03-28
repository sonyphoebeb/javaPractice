## 1. Sum of digits:
      int n = 1234
      int sum = 0;
      
      while (n > 0){
          int digit = n % 10;
          sum += digit;
          n = n/10;
      }
      
      System.out.println(sum);
  
## 2. Prime Number
    int n = 7;

        boolean flag = true;  

        if (n <= 1) {
            flag = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    flag = false;
                    break;
                }
            }
        }

        if (flag) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
