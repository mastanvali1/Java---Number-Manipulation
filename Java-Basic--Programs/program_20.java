  
   // ------------Fibonacci series up to-------

import java.util.*;
class program_20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maxNumber = scan.nextInt();
        int fib1 = 0, fib2 = 1;
        System.out.print("Fibonacci series up to " + maxNumber + ": ");
        while(fib1 <= maxNumber) {
            System.out.print(fib1 + " ");
            int fib3 = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib3;
        }
    }
}
