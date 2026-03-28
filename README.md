<<<<<<< HEAD
# Java Practice Repository
=======
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
>>>>>>> 0d6e2803c61c5e28924d5e9d7649a846a603c81c

Welcome to your Java practice environment. This project is structured to help you organize your learning and practice sessions.

## 🚀 Getting Started

<<<<<<< HEAD
Since Java is not currently detected on your system, please follow these steps to set up your environment:

### 1. Install Java JDK
We recommend installing **JDK 21 (LTS)**. You can download it from:
- [Microsoft Build of OpenJDK](https://learn.microsoft.com/en-us/java/openjdk/download#openjdk-21) (Recommended for Windows)
- [Oracle JDK](https://www.oracle.com/java/technologies/downloads/#java21)

### 2. Set Up Environment Variables
After installation, ensure that the `bin` folder of your JDK is added to your system's `PATH` environment variable.
- Example path: `C:\Program Files\Microsoft\jdk-21.x.x+x\bin`

### 3. Verify Installation
Open a new terminal and run:
```bash
java -version
javac -version
```

## 📂 Project Structure

- `src/basics/`: Core Java concepts (loops, conditionals, math).
- `src/oops/`: Object-Oriented Programming exercises.
- `src/collections/`: Java Collections Framework practice.
- `src/leetcode/`: Algorithmic problem solving.

## 🛠️ How to Run Programs

To compile and run a program (e.g., `HelloWorld.java`):

1. **Compile:**
   ```bash
   javac src/basics/HelloWorld.java
   ```
2. **Run:**
   ```bash
   java -cp src basics.HelloWorld
   ```

## ✍️ Current Practice Tasks

- [x] **Sum of Digits:** Logic moved to [SumOfDigits.java](file:///d:/FullStackDevelopment/java_practice/javaPractice-1/src/basics/SumOfDigits.java)
- [x] **Prime Number:** Logic moved to [PrimeNumber.java](file:///d:/FullStackDevelopment/java_practice/javaPractice-1/src/basics/PrimeNumber.java)
- [ ] **Next:** Try implementing Fibonacci sequence or Palindrome check!
=======
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
>>>>>>> 0d6e2803c61c5e28924d5e9d7649a846a603c81c
