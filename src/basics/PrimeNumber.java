package basics;

public class PrimeNumber {
    public static void main(String[] args) {
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
            System.out.println(n + " is a Prime Number.");
        } else {
            System.out.println(n + " is not a Prime Number.");
        }
    }
}
