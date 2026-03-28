## 1. Sum of digits:
      int n = sc.nextInt();
      int sum = 0;
      
      while (n > 0){
          int digit = n % 10;
          sum += digit;
          n = n/10;
      }
      
      System.out.println(sum);
  
## 2. Prime Number
    int n = sc.nextInt();

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

## 3. Fibonacci Series
      int n = sc.nextInt();

        int a = 0, b = 1;
        
        for(int i = 1; i<=n; i++){
            System.out.println(a + " ");
            
            int next = a + b;
            a = b;
            b = next;
        }
